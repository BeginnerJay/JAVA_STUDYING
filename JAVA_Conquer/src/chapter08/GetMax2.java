package chapter08;
// 인수가 double로 바뀌면 원래의 getMax는 에러 발생
// double 타입의 인수를 취하는 메서드를 하나 더 만들면 된다.
public class GetMax2 {
    static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static double getMax(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(getMax(3,5));
        System.out.println(getMax(3.12,9.78));
    }
}
// 이름, 코드 모두 같지만 인수의 타입이 달라, 실인수의 타입을 보고 어떤 메서드를 호출할 지 정확하게 선택 가능.
// 이처럼 같은 이름으로 여러 개의 메서드를 중복 정의하는 것 -> Method Overloading!
// 인수의 개수가 다르거나, 인수의 자료형이 다르면 overloading 가능!
// 그러나 return type만 다른 method는 중복 대상이 아니다.

// parameter의 이름은 개발자가 임의로 붙일 수 있는 local variable일 뿐이어서 이름이 같아도 같은 method이다.
/* ex) 학생을 이름으로, 학번으로, 학과와 출석 번호로 찾는 경우
int findStudent(String name) 이름으로 찾기
int findStudent(int number) 학번으로 찾기
int findStudent(int dept, int serial) 학과와 출석 번호로 찾기
* */