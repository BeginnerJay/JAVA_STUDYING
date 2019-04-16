package chapter8;
// 특정 기능을 전담하는 코드 덩어리를 Sub Routine이라고 한다. 자바에서는 Method라고 부른다.
// 자바는 모든 메서드를 클래스 내에서 작성하며, 홀로 존재하는 전역 함수를 지원하지 않는다.
// static은 메서드를 독립시키는 기능을 한다.
// 메서드 선언문의 인수를 형식 인수(매개 변수, Parameter)라 하며 호출원이 전달한 값을 대입받아 본체에서 참조할 때 사용.
// 형식 인수는 호출 과정에서 실인수값을 대입받아 본체에서 임시적으로 사용하는 일종의 지역 변수이다.
// 작업 사항이 많다면 얼마든지 많은 인수를 전달할 수 있고,
// 별도의 지시 사항이 없다면 인수가 없어도 무방하다. 인수 없으면 선언문에 빈 괄호만 적는다.

public class Getdays {
// 지정자 리턴타입 메서드명(인수 목록)
	static int getMonthDays(int year, int month) {
		int[] arDays = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if (month == 2) {
			if ( (year%4==0 && year%100 != 0) || year%400==0 ) {
				return 29;
			}
			else {
				return 28;
			}
		} else {
			return arDays[month];
		}
	}

	public static void main(String[] args) {
		int year = 2016;
		int month = 2;

		int days = getMonthDays(year, month);
		System.out.printf("%d년 %d월은 %d일까지 있습니다.", year, month, days);
	}
}
// 구조적 프로그래밍 기법에서 함수는 프로그램의 작업 단위를 분할하는 부품 역할을 한다.
// 객체 지향 기법에서는 메서드가 클래스의 부품으로 격하되었지만, 클래스의 동작을 논리적으로 분할하는 역할을 한다.

/*
1. 두 번 이상 반복되는 코드는 메서드로 분리한다.
2. 한 번에 하나의 일만 한다.
3. 작업 단위를 가급적 잘게 쪼갠다.
4. 직관적이고 좋은 이름을 붙인다.
 */