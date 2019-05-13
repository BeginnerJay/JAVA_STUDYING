package chapter12.treeset;

import chapter12.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberLee = new Member(1001, "이지은");
        Member memberSon = new Member(1002, "손흥민");
        Member memberPark = new Member(1003, "박지성");

        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberSon);
        memberTreeSet.addMember(memberPark);
        memberTreeSet.showAllMember();

        var memberHong = new Member(1003, "홍길동");
        memberTreeSet.addMember(memberHong);
        memberTreeSet.showAllMember();
    }
}
// 오류 발생 : Member 클래스가 Comparable 인터페이스를 구현하지 않았다.

// Exception in thread "main" java.lang.ClassCastException:
// class chapter12.Member cannot be cast to class java.lang.Comparable
// (chapter12.Member is in unnamed module of loader 'app';
// java.lang.Comparable is in module java.base of loader 'bootstrap')

// Comparable 인터페이스ㄹㄹ 구현하지 않았다 -> 우리가 만든 Member 클래스를 TreeSet의 요소로 추사할 때,
    // 어떤 기준으로 노드를 비교하여 트리를 형성해야 하는지를 비교하지 않았다는 뜻.