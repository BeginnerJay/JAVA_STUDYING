package chapter12;
// Comparator 인터페이스 구현하기
import java.util.Comparator;

public class Member2 implements Comparator<Member2> {
    private int memberId;
    private String memberName;

    public Member2(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    @Override
    public int compare(Member2 mem1, Member2 mem2) {
        return mem1.getMemberId() - mem2.getMemberId(); // compare() 메서드 재정의.
        // 전달받은 두 매개변수를 비교함.
    }
}
// Comparable을 이미 구현하여 정렬을 구현했는데, 또 구현하고 싶을 때 Comparator 사용