package chapter24;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Map;

public class OECD_Group_Test {
    public static void main(String[] args) {
        Map<Boolean, List<Country>> map = Data.nara.stream()
                .collect(Collectors.groupingBy(Country::isOecd));

        Set<Boolean> keys = map.keySet();
        Iterator<Boolean> key = keys.iterator();
        while (key.hasNext()) {
            Boolean oecd = key.next();
            System.out.print(oecd + " : ");
            List<Country> n = map.get(oecd);
            for (Country c : n) {
                System.out.print(c.name + " ");
            }
            System.out.println();
        }
    }
}
