package chapter11;
// 리플렉션(reflection)
    // 사용하려는 클래스의 자료형을 모르는 상태에서
    // Class 클래스로 정보를 가져오고, 그것을 활용해 인스턴스 생성 및 메서드 호출하는 것
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class StringClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        // Class 클래스를 가져오기 위해 forName() 메서드 쓰기
            // forName()은 정적 메서드 -> 클래스 생성 없이 사용 가능.
        Class strClass = Class.forName("java.lang.String"); // 클래스 이름으로 가져오기

        Constructor[] cons = strClass.getConstructors(); // 모든 생성자 가져오기
        for (Constructor c : cons) {
            System.out.println(c);
        }
        System.out.println();

        Field[] fields = strClass.getFields(); // 모든 변수(필드)가져오기
        for (Field f : fields) {
            System.out.println(f);
        }
        System.out.println();
        Method[] methods = strClass.getMethods(); // 모든 메서드 불러오기
        for (Method m : methods) {
            System.out.println(m);
        }

        Class personClass = Class.forName("chapter11.Person"); // 클래스 이름으로 가져오기

        Constructor[] pcons = personClass.getConstructors(); // 모든 생성자 가져오기
        for (Constructor c : pcons) {
            System.out.println(c);
        }
        System.out.println();

        Field[] pfields = personClass.getFields(); // 모든 변수(필드)가져오기
        for (Field f : pfields) {
            System.out.println(f);
        }
        System.out.println();
        Method[] pmethods = personClass.getMethods(); // 모든 메서드 불러오기
        for (Method m : pmethods) {
            System.out.println(m);
        }
    }
}
// java.lang.reflect 패키지에 있는 클래스를 활용하면 클래스의 이름만 알아도 클래스의 생성자, 메서드 등을 알 수 있다.
// 생성자나 메서드를 직접 호출할 수도 있다.