package chapter12.hashset;
import chapter12.Member;
public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이지은");
        Member memberSon = new Member(1002, "손흥민");
        Member memberPark = new Member(1003, "박지성");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberSon);
        memberHashSet.addMember(memberPark);
        memberHashSet.showAllMember();

        var memberHong = new Member(1003, "홍길동");
        memberHashSet.addMember(memberHong);
        memberHashSet.showAllMember();
    }
}
// 원래 같은 아이디 가진 회원이 구현되지 않아야 한다~!
// 객체가 동일한 경우에 대한 처리 방법을 구현해 보자.