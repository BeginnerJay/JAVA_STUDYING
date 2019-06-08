package chapter24;

import java.util.Arrays;
import java.util.List;

public class Data {
    static List<Country> nara = Arrays.asList(
            new Country("한국", Cont.ASIA, 49, true),
            new Country("미국", Cont.AMERICA, 318, true),
            new Country("중국", Cont.ASIA, 1355, false),
            new Country("프랑스", Cont.EUROPE, 66, true),
            new Country("나이지리아", Cont.AFRICA, 177, false),
            new Country("독일", Cont.EUROPE, 80, true),
            new Country("헝가리", Cont.EUROPE, 9, true),
            new Country("베트남", Cont.ASIA, 93, false),
            new Country("칠레", Cont.AMERICA, 17, true),
            new Country("캐나다", Cont.AMERICA, 34, true)
    );
}
