package chapter12.treemap;

import chapter12.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member memberLee = new Member(1001, "이지은");
        Member memberSon = new Member(1002, "손흥민");
        Member memberPark = new Member(1003, "박창준");
        Member memberHong = new Member(1004, "홍영준");

        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberSon);
        memberTreeMap.addMember(memberPark);
        memberTreeMap.addMember(memberHong);

        memberTreeMap.showAllMember();

        memberTreeMap.removeMember(1004); // 홍길동 회원 삭제
        memberTreeMap.showAllMember();
    }
}
