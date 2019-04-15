package chapter7;
// 참조형은 사본을 변경하면 원본도 바뀐다.
// 실제 배열은 힙에 하나밖에 없고, 두 개의 참조 변수가 같은 메모리 위치를 가리키고 있는 상태이다.
public class CopyRef {
    public static void main(String[] args) {
        int[] ar = new int[] {1,2,3};
        int[] ar2 = ar;

        ar2[0] = 1000;
        System.out.println(ar[0]);
        System.out.println(ar2[0]);
    }
}
// 메서드를 통해 인수를 전달할 때도, 값을 전달하는 것과 참조를 전달하는 것의 차이가 발생한다.
// 참조형에 대해 완전히 독립적인 사본을 만들려면 clone 메서드를 재정의하여 알맹이까지 완전히 복사해야 한다.
// DoitJava chapter7 ObjectCopy2(얕은 복사), ObjectCopy3(깊은 복사) 참조(책 214)