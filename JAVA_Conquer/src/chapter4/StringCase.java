package chapter4;
/*
 * switch문의 제어 변수는 구분을 위한 값이어서 
 * 주로 정수형을 사용한다. 
 * 실수형은 정확한 상등 비교가 어렵고 부정확해서 사용할 수 없으며
 * long형도 비교 연산이 느려 사용을 금지한다. 
 * 문자열은 원래 사용 금지였지만 
 * 자바 7부터 제어 변수로 사용할 수 있다.
 */
public class StringCase {
	public static void main(String[] args) {

        String country = "China";
        switch (country) {
        case "Korea":
            System.out.println("Seoul");
            break;
        case "China":
            System.out.println("Beijing");
            break;
        case "Japan":
            System.out.println("Tokyo");
            break;
        }
	}
}
/*
 * 문자열 타입의 country 변수로부터 분기하여 나라를 찾고 
 * 해당 나라의 수도를 출력한다. 
 * country가 China로 초기화되어 있어 
 * 중국의 수도인 베이징이 출력된다. 
 * 문자열은 대소문자를 구분하여 정확히 비교하기 때문에 
 * 변수의 값과 case의 대소문자 구성이 일치해야 한다.
 */
