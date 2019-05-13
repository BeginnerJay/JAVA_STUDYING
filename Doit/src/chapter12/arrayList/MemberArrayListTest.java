package chapter12.arrayList;

import chapter12.Member;
import chapter12.arrayList.MemberArrayList;

// import chapter12.Member;
public class MemberArrayListTest {
    public static void main(String[] args) {
        // MemberArrayList memberArrayList = new MemberArrayList();
        var memberArrayList = new MemberArrayList();

        // 새로운 회원 인스턴스 생성
        Member memberLee = new Member(1001, "이지은");
        Member memberSon = new Member(1002, "손흥민");
        Member memberPark = new Member(1003, "박창준");
        Member memberHong = new Member(1004, "홍영준");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberSon);
        memberArrayList.addMember(memberPark);
        memberArrayList.addMember(memberHong);

        memberArrayList.showAllMemeber();

        memberArrayList.removeMember(memberHong.getMemberID()); // 홍길동 회원 삭제
        memberArrayList.showAllMemeber();

        memberArrayList.insertMember(memberHong, 1);
        memberArrayList.showAllMemeber();
    }
}
