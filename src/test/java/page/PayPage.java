package page;

import com.codeborne.selenide.SelenideElement;

import static data.DataHelper.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PayPage {
    private final SelenideElement heading = $(byText("Путешествие дня"));
    private final SelenideElement button = $("//span[text()='Купить']");
    private final SelenideElement buyCardHead = $(byText("Оплата по карте"));
    private final SelenideElement buttonCredit = $("//span[text()='Купить в кредит']");
    private final SelenideElement buyCreditCardHead = $(byText("Кредит по данным карты"));

    private final SelenideElement CardNumberLine = $("[//*[@id='root']/div/form/fieldset/div[1]/span] input");
    private final SelenideElement MonthLine = $("[//*[@id='root']/div/form/fieldset/div[2]/span/span[1]/span] input");
    private final SelenideElement YearLine = $("[//*[@id='root']/div/form/fieldset/div[2]/span/span[2]/span] input");
    private final SelenideElement NameLine = $("[//*[@id='root']/div/form/fieldset/div[3]/span/span[1]/span] input");
    private final SelenideElement UniqueCode = $("[//*[@id='root']/div/form/fieldset/div[3]/span/span[1]/span] input");
    private final SelenideElement RequestButton = $("[//*[@id='root']/div/form/fieldset/div[4]/button]");
    private final SelenideElement iconNotificationApproved = $(byText("Операция одобрена Банком."));
    private final SelenideElement cancelField = $$("[class=\"icon-button__text\"]").first();
    private final SelenideElement iconNotApproved = $(byText("Ошибка! Банк отказал в проведении операции."));
    private final SelenideElement wrongFormat = $(byText("Неверный формат"));
    private final SelenideElement expiredCard = $(byText("Истёк срок действия карты"));
    private final SelenideElement requiredField = $(byText("Поле обязательно для заполнения"));


    public PayPage() {
        heading.shouldBe(visible);
    }


    public PayPage PayTour() {
        button.click();
        return new PayPage();
    }

    public void payApprovedCard(CardInfo cardInfo) {
        PayTour();
        CardNumberLine.setValue(String.valueOf(getApprovedCard()));
        MonthLine.setValue(generateMonth());

    }

    public void inputData(CardInfo card) {
        CardNumberLine.setValue(card.getCardNumber());
        MonthLine.setValue(card.getMonth());
        YearLine.setValue(card.getYear());
        NameLine.setValue(card.getHolder());
        UniqueCode.setValue(card.getCvv());
        RequestButton.click();
    }

    public void notificationApproved() {
        iconNotificationApproved.waitUntil(visible, 10000);
        cancelField.click();

    }

    public void notificationNotApproved() {
        iconNotApproved.waitUntil(visible, 10000);
        cancelField.click();
    }

    public void errorWrongFormat() {
        wrongFormat.waitUntil(visible, 10000);
    }

    public void errorExpiredCard() {
        expiredCard.waitUntil(visible, 10000);
    }

    public void errorEmptyField() {
        requiredField.waitUntil(visible, 10000);
    }

}
