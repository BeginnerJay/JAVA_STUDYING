package chapter11;

class Truck extends Car{
    private int ton;

    Truck(String name, int ton) {
        super(name, false);
        setTon(ton);
    }

    public void setTon(int ton) {
        if (ton >= 0) {
            this.ton = ton;
        } else {
            System.out.println("유효하지 않은 값입니다.");
        }
    }

    void load() {
        System.out.println("짐을 싣는다.");
    }
}