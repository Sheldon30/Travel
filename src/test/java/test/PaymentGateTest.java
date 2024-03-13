package test;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.github.javafaker.Faker;
import data.DashboardPage;
import data.DataHelper;
import data.SQLHelper;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import page.PayPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentGateTest {

    @BeforeEach
    void shouldOpen(){
        open("http://localhost:8080");
        var payPage = new PayPage();

    }
    @AfterEach
    public void cleanDB(){
        SQLHelper.clearDB();
    }
    @BeforeAll
    static void setUpAll(){
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
    @AfterAll
    static void tearDownAll(){
        SelenideLogger.removeListener("allure");
    }
    private static Faker faker;


    @Test
    void shouldPaymentByCardApproved(){
        var openPage = new DashboardPage();
        var payment = openPage.goPayPage();
        payment.inputData(DataHelper.getApprovedCard());
        payment.notificationApproved();
        assertEquals("APPROVED", SQLHelper.getPaymentStatus());
    }

}
