package data;

import com.github.javafaker.Faker;
import lombok.Data;
import lombok.Value;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataHelper {

    public static String CardInfo;

    public DataHelper() {}
   /*public static int generateMonth(){
        YearMonth now = YearMonth.now();
       int randomNumber = ThreadLocalRandom.current().nextInt(37);
        YearMonth randomDate = now.plusMonths(randomNumber);
        return randomDate.getMonthValue();
    }*/
  public static String generateMonth() {
      int shift = (int) (Math.random()*10);
       return LocalDate.now().plusMonths(shift).format(DateTimeFormatter.ofPattern("MM"));
   }
    public static String generateYear(int payYear){
        return LocalDate.now().plusYears(payYear).format(DateTimeFormatter.ofPattern("yy"));
    }
    public static String generateInvalidYear(int payYear){
        return LocalDate.now().minusYears(payYear).format(DateTimeFormatter.ofPattern("yy"));
    }

    public static String generateName(String local) {
        var faker = new Faker(new Locale(local));
        return faker.name().lastName()+" "+faker.name().firstName();
    }
    @Value
    @Data
    public static class CardInfo{
        private String cardNumber;
        private String month;
        private String year;
        private String holder;
        private String cvv;
    }
    public static CardInfo getApprovedCard (){

        return new CardInfo("4444 4444 4444 4441", "08", "24","Перов Иван","255");
    }

    public static CardInfo getDeclinedCard() {

        return new CardInfo("4444 4444 4444 4442", "08", "24","Перов Иван","255");

    }
    public static  CardInfo getCardNumber15Simbols(){
      Faker faker = new Faker();
      String number = faker.number().digits(15);
      String month = generateMonth();
      String year = generateYear(1);
      String cardHolder = faker.name().firstName()+" "+faker.name().lastName();
      String cvv = faker.number().digits(3);
      return new CardInfo(number, month, year, cardHolder, cvv);
    }
    public static  CardInfo getCardNumberMore16Simbols(){
        Faker faker = new Faker();
        String number = faker.number().digits(17);
        String month = generateMonth();
        String year = generateYear(1);
        String cardHolder = faker.name().firstName()+" "+faker.name().lastName();
        String cvv = faker.number().digits(3);
        return new CardInfo(number, month, year, cardHolder, cvv);
    }
    public static CardInfo getEmptiCard(){
      return new CardInfo("","","","","");
    }
    public static  CardInfo getCardInvalidNumberMonth(){
        Faker faker = new Faker();
        String month = faker.number().digit();
        String year = generateYear(1);
        String cardHolder = faker.name().firstName()+" "+faker.name().lastName();
        String cvv = faker.number().digits(3);
        return new CardInfo("4444444444444441", month, year, cardHolder, cvv);
    }
    public static  CardInfo getCardMonthOver12(){
        Faker faker = new Faker();
        String year = generateYear(1);
        String cardHolder = faker.name().firstName()+" "+faker.name().lastName();
        String cvv = faker.number().digits(3);
        return new CardInfo("4444444444444441", "13", year, cardHolder, cvv);
    }
    public static  CardInfo getCardLastYear(){
        Faker faker = new Faker();
        String month = generateMonth();
        String year = generateInvalidYear(1);
        String cardHolder = faker.name().firstName()+" "+faker.name().lastName();
        String cvv = faker.number().digits(3);
        return new CardInfo("4444444444444441", month, year, cardHolder, cvv);
    }
    public static  CardInfo getCardWithFirstName(){
        Faker faker = new Faker();
        String month = generateMonth();
        String year = generateYear(1);
        String cardHolder = faker.name().firstName();
        String cvv = faker.number().digits(3);
        return new CardInfo("4444444444444441", month, year, cardHolder, cvv);
    }
    public static  CardInfo getCardNameOneSimbol(){
        Faker faker = new Faker();
        String month = generateMonth();
        String year = generateYear(1);
        String cardHolder = faker.name().firstName()+" "+faker.name().lastName();
        String cvv = faker.number().digits(3);
        return new CardInfo("4444444444444441", month, year, cardHolder, cvv);
    }
    public static  CardInfo getCardNameWithDash(){
        Faker faker = new Faker();
        String month = generateMonth();
        String year = generateYear(1);
        String cardHolder = faker.name().firstName()+" "+faker.name().lastName()+"-"+faker.name().lastName();
        String cvv = faker.number().digits(3);
        return new CardInfo("4444444444444441", month, year, cardHolder, cvv);
    }
    public static  CardInfo getCardCvvWith2Simbol(){
        Faker faker = new Faker();
        String month = generateMonth();
        String year = generateYear(1);
        String cardHolder = faker.name().firstName()+" "+faker.name().lastName();
        String cvv = faker.number().digits(2);
        return new CardInfo("4444444444444441", month, year, cardHolder, cvv);
    }











}
