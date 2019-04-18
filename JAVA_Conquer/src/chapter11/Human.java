package chapter11;
// 부모는 모든 멤버를 자식에게 물려주지만, 생성자만은 상속되지 않는다.
// 대신 자식 생성자에서 부모 생성자를 호출하여, 상속받은 멤버를 초기화하도록 부탁한다.
// 자식 생성자에서 부모 생성자를 호출할 때에는 super 키워드를 사용한다.

// 자식은 부모를 통해 물려받은 멤버를 초기화하되, 부모의 생성자 중 어떤 것을 호출할 것인지는 선택할 수 있다.
    // 부모의 생성자가 여러 개라면?
        // 자식은 필요, 또는 보유한 정보에 따라 호출하고 싶은 생성자를 선택한다.
class Human {
    private int age;
    private String name;
    private float birth;
    Notebook book; // 객체를 멤버 변수로 가진 모습.

    Human() {}

    Human(int age, String name) {
        setAge(age);
        setName(name);
    }

    Human(float birth, String name) {
        setBirth(birth);
        setName(name);
        java.time.LocalDate now = java.time.LocalDate.now();
        this.age = now.getYear() - (int)birth+1;
    }

    public Human(int age, String name, String CPU, int memory, int storage) {
        setAge(age);
        setName(name);
        book = new Notebook(CPU, memory, storage);
    }

    public void setBirth(float birth) {
        this.birth = birth;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void intro() {
        System.out.printf("안녕, %d살 %s입니다.\n", age, name);
        System.out.print("나의 노트북 : "); book.printSpec();
    }
}
// final(더 이상 수정하지 마라)
    // class : 상속을 허락하지 않는다.
    // method : 재정의를 허락하지 않는다.
    // 안전성과 보안성을 확보하기 위해서이다.
        // Math, String 클래스. 금융이나 보안 분야
