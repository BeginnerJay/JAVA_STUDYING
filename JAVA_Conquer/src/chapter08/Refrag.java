package chapter08;
// 기본형은 값으로 전달되는데 비해 참조형은 변수의 값이 아닌 참조가 전달된다.
// 메서드 내에서 형식 인수가 가리키는 값을 변경하면, 실인수가 가리키는 실제 값도 바뀐다.
// 참조형의 대표격인 배열로 테스트해 보자.
public class Refrag {
    static void getDouble(int[] value) {
        value[0] *=2;
    }

    public static void main(String[] args) {
        int[] num = {2,8,6};
        getDouble(num);
        System.out.println("num[0] = " + num[0]);
    }
}
// 배열 요소는 힙에 있고 num은 시작 위치만 가리킨다.
// 이 배열을 getDouble로 전달하면, 배열의 참조가 형식 인수에 대입되어 실인수와 같은 배열을 가리킨다.
// 이 상태에서 value의 첫 번째 요소를 2배로 만들면 num의 첫 번째 요소도 바뀐다.
// 참조 호출은 실인수 자체를 조작하므로 리턴값이 따로 필요 없다.