package chapter16;

import java.time.LocalDate;
import java.time.LocalTime;

// Calender 클래스도 쓸 만 하지만, 윤초를 제대로 다루지 못히고 항상 수정 가능해서 위험하다.

public class LocalTimeTest {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalTime now = LocalTime.now();
		System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초",
				today.getYear(),
				today.getMonthValue(),
				today.getDayOfMonth(),
				now.getHour(),
				now.getMinute(),
				now.getSecond());
	}
}
