package chapter7;
// 배열 길이만큼 출력하기
// 배열을 사용할 때, 처음 선언한 배열 길이만큼 값을 저장해서 사용하는 경우는 많지 않다.
// 전체 배열 길이와, 현재 배열에 유효한 값이 저장되어 있는 배열요소 개수가
// 같다고 혼동해서는 안 된다.
public class ArrayTest2 {
    public static void main(String[] args) {
        int[] data = new int[5]; // double형으로 길이 5인 배열 선언

        //data[0] = 10.0; data[1] = 20.0; data[2] = 30.0;
        for (int i = 0, num = 2; i < data.length; i++, num+=2) {
            data[i] = num;
        }

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
