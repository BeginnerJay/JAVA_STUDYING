package chapter12.hashmap;
import chapter12.Member;
public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(1001, "이지은");
        Member memberSon = new Member(1002, "손흥민");
        Member memberPark = new Member(1003, "박창준");
        Member memberHong = new Member(1004, "홍영준");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberSon);
        memberHashMap.addMember(memberPark);
        memberHashMap.addMember(memberHong);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(1004); // 홍길동 회원 삭제
        memberHashMap.showAllMember();
    }
}
