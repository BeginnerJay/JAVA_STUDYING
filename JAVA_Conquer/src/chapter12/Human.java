package chapter12;
// 12.1.4 동적 바인딩
// 상속 관계에 있는 부모 자식 간에는 캐스팅이 가능해서, 변수의 선언 타입과 실제 객체가 가리키는 타입이 다를 수 있다.
// 부모와 자식 클래스에 같은 이름의 메서드가 정의되어 있을 때, 과연 어떤 것이 호출될까?
// 호출문으로부터 실제로 호출할 메서드를 정하는 것을 바인딩이라고 하는데, 다음 두 가지 방법이 있다.
// 정적 바인딩 : 변수의 선언 타입을 따른다.
// 동적 바인딩 : 변수의 선언 타입이 아닌, 실제 가리키는 객체에 따라 호출할 메서드가 정해진다.
// 자바에서는 무조건 동적 바인딩을 사용한다. 변수의 타입은 중요하지 않고, 실제 가리키는 객체에 따라 정해짐.
// 동적 바인딩은 다형성의 기초이다.
// 다형성 : 똑같은 구문이지만 상황에 따라 다르게 동작하는 것.

class Human {
    private int age;
    private String name;
    private float birth;


    Human(int age, String name) {
        setAge(age);
        setName(name);
    }

    Human(float birth, String name) {
        setBirth(birth);
        setName(name);
        java.time.LocalDate now = java.time.LocalDate.now();
        this.age = now.getYear() - (int) birth + 1;
    }

    public void setBirth(float birth) {
        this.birth = birth;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void intro() {
        System.out.printf("안녕, %d살 %s입니다.\n", age, name);

    }
}
