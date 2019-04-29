package chapter11;

public class ClassTest {
    // forNmae() 메서드에서 발생하는 예외를 처리함. 이름과 일치하는 클래스가 없는 경우 ClassNotFoundException 발생
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        Class pClass1 = person.getClass(); // Object의 getClass() 메서드 활용하기
        System.out.println(pClass1.getName());

        Class pClass2 = Person.class; // 직접 class 파일 대입하기
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("chapter11.Person"); // 클래스 이름으로 가져오기
        // 패키지이름.클래스이름 으로 가져오는 경우에는 매개변수가 문자열이다.
            // 이 때 매개변수로 받은 문자열에 해당하는 클래스가 없으면 클래스를 가져오는데 실패 -> ClassNotFoundException
        System.out.println(pClass3.getName());

    }
}
