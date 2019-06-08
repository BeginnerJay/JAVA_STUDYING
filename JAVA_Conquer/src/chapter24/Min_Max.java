package chapter24;

import java.util.Optional;
// 스트림의 최대, 최소값을 조사한다.
// 앞쪽 피연산자가 더 크면 양수, 뒤가 더 크면 음수, 같으면 0
// 스트림이 비어 있을 수도 있어 T가 아닌 Optional<T>를 리턴한다.
public class Min_Max {
    public static void main(String[] args) {
        Optional<Integer> max = Data.nara.stream().
                map(Country::getPopu).
                max((a, b) -> a-b);
        System.out.println(max.get());
        Optional<Integer> min = Data.nara.stream().
                map(Country::getPopu).
                min((a, b) -> a-b);
        System.out.println(min.get());
    }
}
