package chapter22;

import chapter05.For;

// 지역변수를 선언하듯, 메서드 안에 임시적인 클래스를 선언하여 사용할 수 있다.
public class LocalClassTest {
    public static void main(String[] args) {
        /*
        메서드의 동작이 복잡해 내부적으로 잠깐 사용할 클래스가 필요하고,
        이 클래스가 다른 곳에서는 사용되지 않는다면 굳이 외부에 선언할 필요가 없다.

        지역 내부 클래스는 자신이 속한 메서드의 지역변수를 액세스할 수 있음은 물론이고,
        메서드가 속한 외부 클래스의 모든 멤버도 참조할 수 있다.
         */
        class LocalHuman {
            int age;
            String name;

            LocalHuman(int age, String name) {
                this.age = age;
                this.name = name;
            }

            void intro() {
                System.out.println("안녕, " + age + "살 " + name + "입니다.");

                final String nameCaption = "이름";
                final String ageCaption = "나이";
                // 출력을 도와줄 전문적인 클래스 Formatter를 내부적으로 선언했다.
                // 내부 클래스는 자신이 속한 메서드의 지역 변수도 참조할 수 있지만,
                // 그 지역 변수는 반드시 final이어야 한다.
                // 메서드가 종료된 후에 로컬 내부 클래스의 메서드가 실행될 수도 있는데,
                // 이 때 지역 변수가 사라지거나 값이 변경되면 에러가 날 수 있기 때문이다.
                // 자바 8부터는 람다식이 지역 변수를 참조하는 경우가 많아, 규정이 완화되었다.
                // final로 선언하지 않았더라도, 지역 클래스가 선언된 후에 값이 바뀌지 않은 변수도
                // 유효한 final로 보고 이 값을 참조하는 것을 허락한다.
                // 지역 클래스 선언 후에 상수의 값을 변경해서는 안된다.
                class Formatter {
                    void outInfo() {
                        System.out.println(nameCaption + " : " + name);
                        System.out.println(ageCaption + " : " + age);
                    }
                }

                Formatter formatter = new Formatter();
                formatter.outInfo();
            }
        }

        LocalHuman kim = new LocalHuman(26, "김재욱");
        kim.intro();
    }

    // 메서드 외부에서는 지역 내부 클래스를 참조할 수 없다.
    static void otherMethod() {
        // Human kim = new Human(29, "김상형");
    }


}
