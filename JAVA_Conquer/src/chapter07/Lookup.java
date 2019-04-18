package chapter07;
// 입력값에 따라 출력값이 개별적으로 다른 경우에는 switch 구문보다 배열으 쓰는 것이 효과적이다.
// 월별 날짜값을 배열에 미리 저장해 두고 월을 첨자로 하여 배열 요소값을 읽므녕 원하는 값을 바로 구할 수 있다.
public class Lookup {
    public static void main(String[] args) {
        int[] arDays = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int month = 5;

        // 날짜 정보를 저장한 배열에서 month 위치의 값을 읽기
        int days = arDays[month];
        System.out.println(month + "월은 " + days + "일까지 있습니다.");
    }
}
