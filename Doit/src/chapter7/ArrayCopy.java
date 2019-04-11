package chapter7;
/* 기존 배열과 자료형 및 배열 크기가 똑같은 배열을 새로 만들거나
배열의 모든 요소에 자료가 꽉 차서
더 큰 배열을 만들어 기존 배열에 저장된 자료를 가져오려고 할 때 배열을 복사한다.
 */
/* 배열을 복사하는 방법은 두 가지가 있다.
1. 기존 배열과 배열 길이가 같거나 더 긴 배열을 만들고, for 문을 사용하여 각 요소 값을 반복해서 복사
2. System.arraycopy(src, srcPos, dest, destPos, length) 메서드를 사용
    1) src : 복사할 배열 이름
    2) srcPos : 복사할 배열의 첫 번째 위치
    3) dest : 복사해서 붙여 넣을 대상 배열 이름
    4) destPos : 복사해서 대상 배열에 붙여 넣기를 시작할 첫 번째 위치
    5) length : src에서 dest로 자료를 복사할 요소 개수
 */
public class ArrayCopy {
    // 객체 배열 복사하기
    public static void main(String[] args) {
        int[] array1 = {10, 20,30,40,50};
        int[] array2 = {1,2,3,4,5};

        System.arraycopy(array1, 0, array2, 1, 4);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
