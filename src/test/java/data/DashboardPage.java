package data;

import com.codeborne.selenide.SelenideElement;
import page.PayPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    private final SelenideElement heading = $(byText("Путешествие дня"));
    private final SelenideElement button = $("//span[text()='Купить']");
    private final SelenideElement buyCardHead = $(byText("Оплата по карте"));
    private final SelenideElement buttonCredit = $("//span[text()='Купить в кредит']");
    private final SelenideElement buyCreditCardHead = $(byText("Кредит по данным карты"));

    public DashboardPage() {
        heading.shouldBe(visible);
    }
    public PayPage goPayPage() {
        button.click();
        return new PayPage();
    }
    public PayPage goCreditCard(){
        buttonCredit.click();
        return new PayPage();
    }


}
