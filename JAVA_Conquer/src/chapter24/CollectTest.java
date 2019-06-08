package chapter24;

/*
collect 메서드는 스트림으로부터 자료를 추출 및 가공하여 다른 형태로 변환하는 최종 연산.
새로운 결과를 저장하기 위한 컨테이너를 만들고,
원본 스트림에서 요소를 읽어 일정한 규칙에 따라 새 컨테이너에 저장
최종 결과를 만들어 낸다.
 */


import java.util.stream.Collectors;

public class CollectTest {
    // toList는 T를 받아 List<T> 객체를 생성한다.
    public	static void main(String[] args) {
        String names = Data.nara.stream()
                .map(Country::getName)
                .collect(Collectors.joining(", "));
        System.out.println(names);
    }
}
