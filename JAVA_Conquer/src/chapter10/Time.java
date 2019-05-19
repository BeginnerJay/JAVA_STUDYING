package chapter10;
// 정보 은닉 : 객체가 부주의한 사용으로부터 오동작을 방지하기 위해 멤버를 숨기는 것
class Time {
    private boolean am;
    private int hour, minute, second;

    Time(int hour, int minute, int second) {
        // 생성자에서도 직접 조작하지 않고 setter를 이용한다.
        /*
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        */
        setHour(hour); setMinute(minute); setSecond(second);
    }


    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        if (hour >=0 && hour <=23) {
            this.am = hour < 12;
            this.hour = hour % 12;
            if (this.hour == 0) {
                this.hour = 12;
            }
        } else {
            System.out.println("유효한 값이 아닙니다.");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            System.out.println("유효한 값이 아닙니다.");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            System.out.println("유효한 값이 아닙니다.");
        }
    }

    void whatTime() {
        System.out.print(am? "오전" : "오후");
        System.out.printf(" %d시 %d분 %d초\n", hour, minute, second);
    }
}
// 내부의 주요 필드는 private. 대신 이 필드를 읽고 쓰는 accessor(getter,setter)는 public!
    // field는 숨기고 accessor만 공개함으로써 조건에 맞는 값만 받아들인다.
// 생성자도 필드를 직접 대입하지 않고 setter를 호출한다.
    // 생성자는 필드를 직접 조작할 수 있지만, 일관된 관리를 위해 값을 변경하는 창구를 일원화하였다.
    // accessor를 통해서만 값을 변경할 수 있어 객체의 유효성이 항상 보장된다.