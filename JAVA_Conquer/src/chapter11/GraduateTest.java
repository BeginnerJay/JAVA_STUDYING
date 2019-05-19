package chapter11;
// 클래스간의 관계는 상대적이다.
public class GraduateTest {
    public static void main(String[] args) {
        Graduate cho = new Graduate(26, "조성우",12345678,"신문방송","취재연구");
        cho.intro();
        cho.study();
        cho.display_student();
        cho.research();
    }
}
