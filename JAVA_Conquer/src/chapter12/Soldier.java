package chapter12;

class Soldier extends Human{
    private int milnum;

    Soldier(int age, String name, int milnum) {
        super(age, name);
        setMilnum(milnum);
    }

    public void setMilnum(int milnum) {
        this.milnum = milnum;
    }

    void intro() {
        System.out.printf("충성. 군번 : %d 입니다.\n",milnum);
    }


}
