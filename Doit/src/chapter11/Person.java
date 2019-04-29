package chapter11;
// Class 클래스
// 어떤 경우에는 여러 클래스 중 상황에 따라 다른 클래스를 사용해야 할 때도 있고,
// 반환받는 클래스가 정확히 어떤 자료형인지 모를 때도 있다.
// 모르는 클래스의 정보를 사용하여, 클래스 정보를 직접 찾아야 할 때 Class 클래스를 사용한다.
public class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
