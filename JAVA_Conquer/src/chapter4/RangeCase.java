package chapter4;
/*
 * score 변수값이 90 ~ 100 사이라는 조건문은 
 * 논리 연산자를 사용하여 score >= 90 && score <= 100 
 * 으로 작성할 수 있고 if문에는 이런 조건을 사용할 수 있다. 
 * 그러나 case문에는 상수값 하나만 적을 수 있어 
 * 범위를 지정할 수 없다. 이럴 때는 약간 응용을 해야 하는데 
 * 값을 10으로 나눈 후 10자리값을 선택하면 된다.
 */
public class RangeCase {
	public static void main(String[] args) {

        int score = 82;

        switch (score/10) {
        case 10:
        case 9:
            System.out.println("A");
            break;
        case 8:
            System.out.println("B");
            break;
        case 7:
            System.out.println("C");
            break;
        case 6:
            System.out.println("D");
            break;
        default:
            System.out.println("F");
            break;
        }
   }
}
/*
 * 이 예에서 보다시피 문법은 응용의 묘미가 있으며 
 * 기본 문법을 잘 응용하면 더 복잡한 일도 간단히 처리할 수 있다. 
 * 위 예제는 나눗셈과 case에 의한 연결을 절묘하게 잘 활용한 예인데 
 * 배열이나 연산식을 활용하면 더 짧게 줄일 수도 있다.
 */
