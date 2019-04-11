/*
유효한 값이 저장된 배열 요소만 정확히 출력하려면
새로운 변수를 선언하고, 배열 요소 순서대로 값을 저장할 때마다
그 변수 값을 증가시킨다.
그리고 반복문 종료 조건으로, 배열의 length 속성이 아닌 해당 변수를 사용하자.
 */

package chapter7;
public class ArrayTest3 {
    public static void main(String[] args) {
        double[] data = new double[5];
        int size = 0;
        data[0] = 10.0; size++;
        data[1] = 20.0; size++;
        data[2] = 30.0; size++;

        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }
}

