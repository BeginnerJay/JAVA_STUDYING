// TreeSet과 마찬가지로 이진 검색 트리로 구현되었다.
// key 값으로 정렬하므로, key값에 해당하는 클래스에 Comparable이나 Comparator 인터페이스 구현 필요.
// key 값인 회원 아이디는 Integer형인데, JavaDoc에서 살펴보면 이미 Integer 클래스에는 Comparable 인터페이스가 구현되어있음.
package chapter12.treemap;

import java.util.Iterator;
import java.util.TreeMap;
import chapter12.Member;

public class MemberTreeMap {
    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap(/*TreeMap<Integer, Member> treeMap*/) {
        // this.treeMap = treeMap;
        treeMap = new TreeMap<Integer, Member>();
    }

    public void addMember(Member member) {
        treeMap.put(member.getMemberID(), member); // key-value 값으로 쌍으로 추가
    }

    public boolean removeMember(int memberId) {
        if (treeMap.containsKey(memberId)) {
            treeMap.remove(memberId); // key 값에 맞는 자료 삭제
            return true;
        }
        System.out.printf("%d가 존재하지 않습니다.\n",memberId);
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> ir = treeMap.keySet().iterator();
        while (ir.hasNext()) {
            int key = ir.next();
            Member member = treeMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
