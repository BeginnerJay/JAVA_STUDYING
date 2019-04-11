package chapter4;
/*
 * 만약 country를 사용자가 직접 입력한다면 
 * CHINA로 입력할 수도 있고 china로 입력할 수도 있는데 
 * 이 경우는 case문의 China와 달라 제대로 선택되지 않는다. 
 * 이런 문제를 방지하려면 문자열 변수의 toLowerCase 
 * 메서드를 호출하여 모두 소문자로 바꾸고 
 * case문도 소문자로 써서 비교한다
 */
public class StringCase2 {
	 public static void main(String[] args) {

         String country = "CHINA";

         switch (country.toLowerCase()) {
         case "korea":
             System.out.println("Seoul");
             break;
         case "china":
             System.out.println("Beijing");
             break;
         case "japan":
             System.out.println("Tokyo");
             break;
         }
    }
}
