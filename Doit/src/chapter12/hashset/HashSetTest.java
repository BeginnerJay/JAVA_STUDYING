// HashSet 테스트하기
package chapter12.hashset;
// HashSet 클래스는 집합 자료 구조를 구현하며, 중복을 허용하지 않는다.
import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(new String("임요환"));
        hashSet.add(new String("박정희"));
        hashSet.add(new String("홍길동"));
        hashSet.add(new String("강감찬"));
        hashSet.add(new String("강감찬"));

        System.out.println(hashSet);
    }
}
