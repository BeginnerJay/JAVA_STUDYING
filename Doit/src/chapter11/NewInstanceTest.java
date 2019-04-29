package chapter11;
// Class 클래스로 직접 인스턴스 생성하기
// newInstance() 메서드는 항상 Object를 반환하므로, 생성한 객체형으로 형 변환해야 한다.
public class NewInstanceTest {
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        Person person1 = new Person(); // 생성자로 생성하기
        System.out.println(person1);

        Class pClass = Class.forName("chapter11.Person");
        Person person2 = (Person)pClass.newInstance();// Class 클래스의 newInstance() 메서드로 생성하기
        System.out.println(person2);
    }
}
// 이미 우리가 자료형을 알고 있는 경우에는 Class 클래스를 활용할 필요가 없다.
// 프로그램 실행 중에 클래스를 메모리에 로딩하거나, 객체가 다른 곳에 위치해 원격 로딩하여 생성할 때 사용한다.

// forName() 메서드는 매개변수로 문자열 입력 -> 입력받는 문자열을 변수로 선언하여 변수 값만 바꾸면 다른 클래스 로딩가능
    // 필요에 따라 로딩되는 클래스를 동적으로 변경 가능.
// forName() 주의할 점
    // 문자열에 오류가 있어도 컴파일할 때에는 그 오류를 알 수 없다.(동적 로딩)