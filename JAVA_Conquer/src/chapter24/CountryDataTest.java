package chapter24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CountryDataTest {
    public static void main(String[] args) {
        List<Country> oecd = new ArrayList<>();
        for (Country c:Data.nara) {
            if (c.oecd) {
                oecd.add(c);
            }
        }

        Collections.sort(oecd, new Comparator<Country>() {
            public int compare(Country o1, Country o2) {
                return o2.popu - o1.popu;
            }
        });


        int total = 0;
        for (int i = 0; i < 3; i++) {
            total += oecd.get(i).popu;
        }
        System.out.println("OECD 상위 3개국의 인구수 = " + total);
    }
}
/*
이 정도 컬렉션 관리는 기본이며, 과거에는 다 이런 코드를 작서앻ㅆ다.
    다 사용한후 결국 버리지만, 중간 연산 결과를 저장할 임시 컬렉션이 필요하다.
    모든 알고리즘을 일일히 수동으로 구현한다.(추출, 정렬, 합산)
    상위 3개국을 골라내기 위해, 전체 컬렉션을 정렬하는 불필요한 과정을 거친다.
    순서대로 실행해서 결과를 만들어내니, 병렬화하기 어려워 성능 개선의 여지가 없다.
 */