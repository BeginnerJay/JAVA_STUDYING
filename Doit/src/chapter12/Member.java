package chapter12;

// import java.util.Objects;

// 회원 관리 프로그램에서 회원 추가, 삭제, 전체 회원 정보 출력 기능 구현
// 실무에서는 계층적으로 패키지 구조를 잡아, 소스 코드 파일을 구분하여 사용한다.
public class Member implements Comparable<Member> {
    private int memberID; // 회원 아이디
    private String memberName; // 회원 이름

    public Member(int memberID, String memberName) {
        this.memberID = memberID;
        this.memberName = memberName;
    }


    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public int compareTo(Member member) { // 추가한 회원 아이디와, 매개변수로 받은 회원 아이디를 비교함.
        return (this.memberID - member.memberID); // 오름차순 정렬
        // return (this.memberID - member.memberID)*(-1); // 내림차순 정렬
        //return this.memberName.compareTo(member.memberName);  //String 클래스에 compareTo() 가 정의되어 있으므로 활용
        // 이름 순으로 정렬
    }

    @Override
    public String toString() { // toString() 메서드 재정의
        return "Member{" +
                "memberID=" + memberID +
                ", memberName='" + memberName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        /*
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return memberID == member.memberID &&
                Objects.equals(memberName, member.memberName);
        */
        if (object instanceof Member) {
            Member member = (Member)object;
            if (this.memberID == member.memberID) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        // return Objects.hash(memberID);
        return memberID;
    }
}
