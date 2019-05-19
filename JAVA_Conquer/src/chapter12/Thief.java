package chapter12;

class Thief extends Human {
    private String item;
    private int star;

    public void setItem(String item) {
        this.item = item;
    }

    public void setStar(int star) {
        this.star = star;
    }

    Thief(int age, String name, String item, int star) {
        super(age, name);
        setItem(item);
        setStar(star);
    }

    void intro() {
        System.out.printf("%s 전문 털이범 전과 %d범입니다.\n",item, star);
    }
}
