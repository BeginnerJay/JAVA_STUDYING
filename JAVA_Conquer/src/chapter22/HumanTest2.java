package chapter22;

public class HumanTest2 {
    public static void main(String[] args) {
        Human2 jwKim = new Human2(26, "재욱", "김");
        jwKim.intro();
        jwKim.name.outAge();

        Human2.Name name = jwKim.new Name("방뎅이", "궁뎅이");
        System.out.printf("%s%s :",name.family, name.first);
        name.outAge();

        jwKim.name.outName();
        jwKim.name.outWho();
    }
}
// age는 Name의 필드가 아니지만, Name의 메서드인 outAge에서 읽을 수 있다.
// Name이 Human에 소속된 특수한 관계이기 때문에 이런 코드가 가능하다.
// 내부 클래스의 객체는 외부 클래스의 객체와 반드시 같이 생성된다.
// age는 Name 소속은 아니지만, outAge 메서드가 호출될 때 반드시 생성되어 있어 항상 액세스 가능하다.

// jwKim 객체에 이름이 두 개 생성되어 있는 상황을 만들었다. 아주 특수한 경우 사용된다.
// 내부 클래스의 객체를 밖에서 생성할 일이 잦다면, 이는 디자인을 잘못 한 것이다.
// 내부 클래스를 밖으로 분리하거나, 정적으로 선언할 것을 고려해 보아햐 한다.