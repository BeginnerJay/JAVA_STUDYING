package chapter6;

public class CardCompanyTest {

    public static void main(String[] args) {

        CardCompany company = CardCompany.getInstance();  //싱글톤 패턴

        Card myCard = company.createCard();   //메서드에서 Car 생성
        Card yourCard = company.createCard();

        System.out.println(myCard.getCardNum());    //10001  출력
        System.out.println(yourCard.getCardNum());  //10002  출력

    }
}