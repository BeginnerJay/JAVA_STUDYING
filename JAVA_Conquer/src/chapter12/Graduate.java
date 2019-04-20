package chapter12;

class Graduate extends Student{
    private String thesis;

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }

    public Graduate(int age, String name, int stnum, String major, String thesis) {
        super(age, name, stnum, major);
        setThesis(thesis);
    }

    void intro() {
        System.out.printf("%s 논문을 쓰고 있는 대학원생입니다.\n", thesis);
    }
}
