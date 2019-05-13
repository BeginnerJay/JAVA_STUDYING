package chapter12.hashset;

import java.util.HashSet;
import java.util.Iterator;

import chapter12.Member;
public class MemberHashSet {
    private HashSet<Member> hashSet; // HashSet 선언

    public MemberHashSet() {
        hashSet = new HashSet<Member>(); // HashSet 생성자
    }

    public void addMember(Member member) {
        hashSet.add(member); // HashSet에 회원 추가
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> ir = hashSet.iterator(); // Iterator를 활용해 순회함.

        while (ir.hasNext()) {
            Member member = ir.next(); // 회원들을 하나씩 가져와서
            int tempId = member.getMemberID(); // 아이디 비교
            if (tempId == memberId) { // 같은 아이디인 경우
                hashSet.remove(member); // 회원 삭제
                return true;
            }
        }
        System.out.printf("%d가 존재하지 않습니다.", memberId);
        return false;
    }
    public void showAllMember() {
        for (Member member : hashSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}
