package chapter11;
// 계층을 정확하고 빠르게 이해하려면 위쪽의 부모 클래스부터 순서대로 학습해야 한다.

public class PeopleTest {
    public static void main(String[] args) {
        Student cho = new Student(26,"조성우",13685557,"신문방송");
        cho.display_student();

        Soldier kim = new Soldier(26, "김재욱", 1576046680);
        kim.fight();

        Thief cheon = new Thief(26, "천민석","다이아",5);
        cheon.steal();
    }
}
