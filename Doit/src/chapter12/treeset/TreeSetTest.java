package chapter12.treeset;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");

        for (String str : treeSet) {
            System.out.println(str);
        }
    }
}
// 값이 정렬되어서 출력되었다. -> 이진 검색 트리 사용하여 정렬.