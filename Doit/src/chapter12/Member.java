package chapter12;
// 회원 관리 프로그램에서 회원 추가, 삭제, 전체 회원 정보 출력 기능 구현
// 실무에서는 계층적으로 패키지 구조를 잡아, 소스 코드 파일을 구분하여 사용한다.
public class Member {
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
    public String toString() { // toString() 메서드 재정의
        return "Member{" +
                "memberID=" + memberID +
                ", memberName='" + memberName + '\'' +
                '}';
    }
}
