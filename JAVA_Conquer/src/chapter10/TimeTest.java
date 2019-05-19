package chapter10;

public class TimeTest {
    public static void main(String[] args) {
        Time now = new Time(12,34,56);
        now.whatTime();

        // now.hour = 34; // 에러난다. setter를 거치지 않고 private에 접근하려고 했기 때문.
        now.setHour(34);
        now.setSecond(-25);
        now.whatTime();

        now.setHour(10);
        now.setMinute(45);
        now.whatTime();
    }
}
