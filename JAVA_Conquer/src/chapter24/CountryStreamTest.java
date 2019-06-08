package chapter24;

import java.util.Comparator;

public class CountryStreamTest {
    public static void main(String[] args) {
        int total = Data.nara.stream()
                .filter(c -> c.oecd)
                .sorted(Comparator.comparing(Country::getPopu).reversed())
                .limit(3)
                .map(Country::getPopu)
                .reduce(0, Integer::sum);
        System.out.printf("OECD 상위 3개국의 인구수 = %d", total);
    }
}
/*
스트림은 모든 요구 사항을 모아 한 번에 처리한다.(파이프라인 연산)
컬렉션은 자료를 어떻게 다룰 것인지를 구체적으로 지정하지만, 스트림 연산에서는 뭘 원하는지만 선언한다.
스트림이 컬렉션 연산에 비해 우월한 이유는, 구체적이지 않고 선언적이기 때문이다.
컬렉션, 제네릭, 람다, 함수 레퍼런스까지 고급 문법이 모두 동원된다.

스트림은 연산에 특화되어 있다. 대규모 연산을 하려면 컬렉션을 스트림으로 전환하자.
Stream<E> stream()
Stream<E> pararrelStream() // 병렬 처리되는 스트림
 */