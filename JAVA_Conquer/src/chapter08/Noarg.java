package chapter08;
// 날짜 객체로부터 현재 날짜를 조사하고, 그 중 日 요소만 추출하는 동작을 하는데, 이 작업을 별도의 메서드로 정의하였다.
// 오늘 날짜를 구하는 데에 특별한 선택 사항이나 옵션이 없으니 인수는 불필요하다. 그러나 빈 괄호는 필요

public class Noarg {
    static int getDate() {
        java.time.LocalDate today = java.time.LocalDate.now();
        int day = today.getDayOfMonth();
        return day;
    }

    public static void main(String[] args) {
        System.out.printf("오늘은 %d일입니다.", getDate());
    }
}
