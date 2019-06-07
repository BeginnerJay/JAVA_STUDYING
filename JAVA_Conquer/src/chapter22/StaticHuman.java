package chapter22;
// 정적 내부 클래스는 소속만 외부 클래스 안에 있을 뿐, 일반적인 클래스와 같다.
// 그러므로 내부 클래스에서 외부 클래스의 멤버를 참조할 수 없다.
// 생성할 때에도 Outer.Inner 식으로 소속만 밝힐 뿐, 객체로부터 생성하지 않는다.
public class StaticHuman {
    int age;
    Name name;

    static class Name {
        String first;
        String family;

        Name(String first, String family) {
            this.first = first;
            this.family = family;
        }
    }

    StaticHuman(int age, String first, String family) {
        this.age = age;
        this.name = new Name(first, family);
    }

    void intro() {
        System.out.println("안녕, " + age + "살 " + name.family + name.first + "입니다.");
    }
}
