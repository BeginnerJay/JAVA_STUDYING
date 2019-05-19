package chapter09;
// 생성자도 일종의 메서드여서, 시그니처가 다르면 여러 벌로 오버로딩이 가능하다.
class Time {
    /*
    // 기본형은 지역 변수를 선언하듯 = 연산자와 함께 초기값을 바로 지정하면 된다.
    boolean am = true;
    int hour = 12, minute = 0, second = 0;

    // 멤버 변수가 수십개가 되면 생성자에서 일일히 초기화하기 번거롭다.
        // 객체마다 특별히 달라질 필요가 없는 멤버 변수는 무난한 값으로 명시적 초기화하는 것이 편리하다.
        // 선언문에 일단 초기화해 놓고, 필요한 부분만 다른 생성자나 메서드로 다시 초기화한다.
    */
    boolean am;
    int hour, minute, second;
    // 초기화 블록
    {
        java.time.LocalTime now = java.time.LocalTime.now(); // LocalTime 자료형인 now를 LocalTime으로 선언
        hour = now.getHour();
        if (hour >= 12) {
            hour -= 12;
            am = false;
        } else {
            am = true;
        }
        minute = now.getMinute(); // LocalTime 클래스의 getMinute() 메서드 호출
        second = now.getSecond();
    }


    // 명시적 초기화는 대입의 형태를 취하므로, 우변은 주로 리터럴이다.
    // 표현식만 가능하다. 문장, 메서드 호출, 조건문, 반복문 사용 불가!
    // 초기값을 따로 계산할 필요가 있다면 초기화 블록을 사용한다.
        // 클래스 선언문에 { } 블록으로 작성하며, 별도의 이름을 지정할 필요는 없다.
        // 객체를 할당한 직후에 이 블록이 호출되어 멤버 변수를 초기화한다.
            // 생성자에서 다시 다른 초기값으로 변경 가능
        // 위치는 상관없지만, 메서드보다 위에 놓는 것이 보기 좋다.
        // 여러 개의 블록을 선언하면 위에서부터 실행된다.




    // default constructor는 아무것도 하지 않아 초기값을 유지한다.
    Time() {}

    // 인수를 받는 생성자는 전달받은 값으로 명시적 초기값을 변경한다.
    Time(boolean am, int hour, int minute, int second) {
        this.am = am;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    // 개발자가 생성자를 정이하지 않아도 최소한 기본값으로 객체를 생성할 수 있어야 한다.
    // 그래서 따로 constructor가 없어도 default constructor는 compiler가 만들어 준다.

    Time(boolean am, int hour, int minute) {
        // 첫 번째 생성자를 호출하되, second 인수 대신 0을 전달한다.
        this(am, hour, minute, 0);
    }

    Time(int hour24, int minute) {
        // 두 번째 생성자를 호출하되, 시간으로부터 am값을 판별하고, 시간을 12로 나눈 나머지를 정규화하여 전달한다.
        // 전달받은 정보를 가공하여 다른 생성자를 호출하는 것이다.
        this(hour24 < 12, hour24 % 12, minute);
    }
    // 필드를 초기화하는 진짜 코드는 한 생성자에만 작성하고, 나머지는 인수로 전달받은 값을 가공해 넘기는 식이다.
    // 중복 코드가 제거되어 간략하며, 초기화의 주요 논리가 한 곳에 집중되어 관리에도 용이하다.
    // 사람이 귀찮은 암산을 하지 않기 위해 생성자를 일일이 오버로딩시켜 놓는다.
    // 생산성을 조금이라도 향상시키려면 객체를 최대한 쓰기 쉽도록 해야 한다.


    /*
    그런데 생성자끼리 코드의 중복이 너무 많다.
    Time(boolean am, int hour, int minute) {
        this.am = am;
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }

    Time(int hour24, int minute) {
        this.am = hour24 < 12;// 12보다 작으면 오전, 12보다 크면 오후
        this.hour = hour24 % 12;
        this.minute = minute;
        this.second = 0;
    }
    */
    void whatTime() {
        System.out.print(am? "오전" : "오후");
        System.out.printf(" %d시 %d분 %d초", hour, minute, second);
    }
}
