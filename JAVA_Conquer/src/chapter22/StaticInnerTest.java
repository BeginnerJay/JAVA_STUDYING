package chapter22;

public class StaticInnerTest {
    public static void main(String[] args) {
        StaticHuman kim = new StaticHuman(29, "상형", "김");
        kim.intro();

        StaticHuman.Name name = new StaticHuman.Name("순신", "이");
        // 이렇게 생성된 name 객체는 나이 정보는 가지지 않는다. 두 개의 name 객체는 완전히 별개다.
        System.out.println("이름 : " + name.family + name.first);
    }
}
//별도로 선언하는 것과 같지만, 긴밀한 관계가 아니덜도 보조 타입으로 사용한다면 내부 정적 클래스로 선언하여
// 캡슐화하는 것이 재사용에 유리하다.

// 일반 멤버는 정적 멤버를 자유롭게 읽을수 있지만, 정적 멤버는 정적 멤버만 억세스할 수 있다.