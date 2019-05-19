package chapter12;

class Student extends Human {
    private int stnum;
    private String major;

    Student(int age, String name, int stnum, String major) {
        super(age, name);
        setStnum(stnum);
        setMajor(major);
    }

    Student(float birth, String name, int stnum, String major) {
        super(birth, name);
        setStnum(stnum);
        setMajor(major);
    }


    public void setStnum(int stnum) {
        this.stnum = stnum;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    void display_student() {
        System.out.println("이름 : " + super.getName());
        System.out.println("전공 : " + major);
    }

    void study() {
        System.out.println("하늘 천 따 지 검을 현 누를 황");
    }

    // 사람은 몇살 누구라고 소개하지만, 학생은 학번과 전공이라는 정보도 있다.
    // intro method는 Human에도, Student에도 잇다.
    // 자식이 부모의 메서드와 같은 이름으로 메서들르 다시 정의하면, 자식 객체에 대해서는 재정의한 메서드가 호출된다.
    // 부모와 동작이 조금이라도 다르다면 어떤 메서드이든 재정의할 수 있다.
    // 생성자와 달리 super.intro()를 나중에 호출해도 상관없다.
    @Override
    void intro() {
        System.out.println("*****************");
        System.out.println("전공 : " + major);
        System.out.println("학번 : " + stnum);
        super.intro();
    }
}
