package chapter24;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Map;


/* 일정한 기준에 따라 요소를 나누어 맵을 작성한다.
static <T,K> Collector<T, ?, Map<K, List<T> > > groupingBy(Function<T,K> clasifier)
인수로는 그룹핑에 사용할 키를 리턴하는 함수를 전달한다.

그룹핑할 키만 주면, 키와 리스트의 맵을 리턴한다.
예제에서는 대륙으로 나라를 그룹핑햇다.
 */
public class GroupingByTest {
    public static void main(String[] args) {
        Map<Cont, List<Country>> map = Data.nara.stream()
                .collect(Collectors.groupingBy(Country::getCont));

        Set<Cont> keys = map.keySet();
        Iterator<Cont> key = keys.iterator();
        while (key.hasNext()) {
            Cont cont = key.next();
            System.out.print(cont + " : ");
            List<Country> n = map.get(cont);
            for (Country c : n) {
                System.out.print(c.name + " ");
            }
            System.out.println();
        }
    }
}
