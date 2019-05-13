package chapter12.treeset;

import java.util.Iterator;
import java.util.TreeSet;
import chapter12.Member;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet(/*TreeSet<Member> treeSet*/) {
        // this.treeSet = treeSet; // Default Constructor
        treeSet = new TreeSet<Member>();
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public boolean removeMember(int memberID) {
        Iterator<Member> ir = treeSet.iterator(); // Iterator를 활용해 순회함.
        while(ir.hasNext()) {
            Member member = ir.next();
            int tempId = member.getMemberID();
            if (tempId == memberID) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.printf("%d가 존재하지 않습니다.\n", memberID);
        return false;
    }

    public void showAllMember() {
        for (Member member : treeSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}
