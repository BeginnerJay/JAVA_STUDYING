package chapter23;

public class Outer {
    void method() {
        // 지역 클래스에서의 this
        class PlusOneImpl implements PlusOne {
            public int plus(int i) {
                System.out.println(this);
                return i+1 ;
            }
        }
        PlusOne po = new PlusOneImpl();
        System.out.println("result = " + po.plus(5));

        // 람다식에서의 this
        PlusOne po2 = i -> {
            System.out.println(this);
            return i+1;
        };
        System.out.println("result = " + po2.plus(5));
    }
}
/*
내부 클래스에 비해 훨씬 단순한 동작을 하는 람다식은 자기 자신을 참조할 일이 거의 없다.
람다식은 객체의 형태로 구현될 뿐, 실제로는 함수여서 참조할 멤버가 없으니
    굳이 this로 가리킬 일이 없다.
 */
// 함수형 인터페이스는 ㅏㄸㄱ 하나의 추상 메서드를 가진다.
// 이를 혼동하지 않기 위해 @FunctionalInterface 애노테이션을 붙인다.
// 단 디폴트 메서드와 정적 메서드는 여러 개 있어도 상관없다.