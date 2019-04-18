package chapter08;
// 인수의 타입에 따라 메서드 내에서 인수 수정 시의 효과가 달라진다.
// 기본 타입은 값만 전달되며 메서드 내에서 인수 수정시의 효과가 달라진다.
public class ValueArg {
    static int getDouble(int value) {
        value *=2;
        return value;
    }

    public static void main(String[] args) {
        int num = 2;
        getDouble(num);
        System.out.println("num = " + num);
    }
}
// getDouble이 2를 곱한 대상은 형식 인수 value이지 실인수 num이 아니다.
// 선언 단계에서 num과 value의 값이 잠시 같아질 뿐, 두 변수는 기억 장소가 분리된 다른 변수이다.
// 메서드의 리턴값을 대입받지 않으면 버려진다.