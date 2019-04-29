package chapter11;

public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyDate) {
            MyDate mdt = (MyDate)obj;
            if (this.day == mdt.day) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
