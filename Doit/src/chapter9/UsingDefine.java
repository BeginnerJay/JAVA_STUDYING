package chapter9;

public class UsingDefine {
    public static void main(String[] args) {
        System.out.println(Define.GOOD_MORNING);
        System.out.printf("최솟값은 %d입니다.\n",Define.MIN);
        System.out.printf("최댓값은 %d입니다.\n",Define.MAX);
        System.out.printf("수학 과목 코드는 %d입니다.\n",Define.MATH);
        System.out.printf("영어 과목 코드 값은 %d입니다.\n",Define.ENG);
    }
}
// 클래스를 final로 선언하면 상속할 수 없다.(String 클래스, Math 클래스 등)