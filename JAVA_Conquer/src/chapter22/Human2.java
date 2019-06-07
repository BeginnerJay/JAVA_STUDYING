package chapter22;



public class Human2 {
    int age;
    Name name;

    class Name {
        String first;
        String family;

        Name(String first, String family) {
            this.first = first;
            this.family = family;
        }

        void outAge() {
            System.out.println("저는 " + age + "살입니다.");
        }
        /*
        클래스가 중첩된 상태에서는 this가 어떤 객체를 나타내는지 애매하다.
            그냥 this라고 하면 안쪽 클래스의 객체를 가리킨다.
            바깥 쪽 클래스 객체를 칭하려면 외부클래스.this 라고 써야 한다.
        중첩 상태에서는 this도 명확한 소속을 밝혀야 한다.
         */
        void outName() {
            Util.outName(this);
        }

        void outWho() {
            Util.outHuman(Human2.this);
        }
    }

    Human2(int age, String first, String family) {
        this.age = age;
        this.name = new Name(first, family);
    }

    void intro() {
        System.out.println("안녕, " + age + "살 " + name.family + name.first + "입니다.");
    }
}
/*내부 클래스의 장점
    외부 클래스가 필요한 정보를 다 포함하여, 재사용성이 향상된다.
    다른 곳에서 사용하지 않는 클래스를 숨겨, 보안성과 안정성이 향상된다.
    연관 있는 클래스를 하나로 묶어 긴밀한 관계가 되며, 서로의 멤버를 자유롭게 참조할 수 있다.
 */
// protected 의 액세스 지정자로 감출 수 있고, static 지정자로 정적으로 선언할 수도 있다.