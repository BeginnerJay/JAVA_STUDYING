package chapter12.arrayList;
import chapter12.Member;

import java.util.ArrayList;
import java.util.Iterator;

// import chapter12.Member;
public class MemberArrayList {
    private ArrayList<Member> arrayList; // arrayList 선언

    public MemberArrayList() {
        arrayList = new ArrayList<Member>(); // Member형으로 선언한 ArrayList 생성
    }

    public void addMember(Member member) {
        arrayList.add(member); // arrayList에 회원을 추가하는 메서드(순서대로)
    }

    public void insertMember(Member member, int index) {
        arrayList.add(index, member); // index를 넣으면 회원을 정해진 순서에 넣을 수 있다.
    }

    public boolean removeMember(int memberId) {
        for (int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i); // get() 메서드로 회원을 순차적으로 가져옴
            int tempId = member.getMemberID();
            if (tempId == memberId) { // 회원 아이디가 매개변수와 일치하면
                arrayList.remove(i); // 해당 회원을 삭제
                return true;
            }
        }
        System.out.printf("%d가 존재하지 않습니다", memberId);
        return false; // 반복문이 끝날 때까지 해당 아이디를 찾지 못한 경우
    }

    public boolean deleteMember(int memberId) {
        Iterator<Member> ir = arrayList.iterator(); // iterator 반환
        while (ir.hasNext()) { // boolena hasNext() : 이후에 요소가 있는지 체크하고, 있으면 true 반환
            Member member = ir.next(); // 요소가 있는 동안 다음 회원을 반환받음.

            int tempId = member.getMemberID();
            if (tempId == memberId) { // 회원 아이디가 매개변수와 일치하면
                arrayList.remove(member); // 해당 회원 삭제
                return true; // true 반환
            }
        }
        System.out.printf("%d가 존재하지 않습니다", memberId);
        return false; // 반복문이 끝날 때까지 해당 아이디를 찾지 못한 경우
    }

    public void showAllMemeber() {
        for (Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
        // 같은 기능을 한다.
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println();
    }
}
