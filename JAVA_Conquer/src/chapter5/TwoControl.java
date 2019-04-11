package chapter5;
/*
 * 제어 변수는 보통 하나만 쓰지만 
 * 콤마 연산자를 사용하면 두 개 이상의 제어 변수를 사용할 수도 있다. 
 * 초기식이나 조건식에 콤마를 찍고 
 * 양쪽에 각 변수를 초기화 및 증감시키는 명령을 작성한다. 
 * 다음 예제는 i와 j를 제어 변수로 사용한다
 */
public class TwoControl {
	public static void main(String[] args) {

        for (int i = 0, j = 1; i < 5; i++, j = j + 2){
            System.out.println("i = " + i + ", j = " + j);
        }
	}
}
/*
 *콤마 연산자는 좌우의 두 명령을 순서대로 실행한다. 
 *범위와 증감 정도가 다른 두 제어 변수를 사용할 수 있는데 
 *이런 예를 보면 for문이 얼마나 유연한지 알 수 있다. 
 */
