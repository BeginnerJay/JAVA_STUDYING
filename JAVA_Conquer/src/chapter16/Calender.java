package chapter16;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calender {
	public static void main(String[] args) {
		GregorianCalendar today = new GregorianCalendar();
		System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초",
				today.get(Calendar.YEAR), 
				today.get(Calendar.MONTH) + 1, // 반드시 1 더해야 한다.
				today.get(Calendar.DATE), 
				today.get(Calendar.AM_PM) == Calendar.AM ? "오전":"오후", 
				today.get(Calendar.HOUR), 
				today.get(Calendar.MINUTE), 
				today.get(Calendar.SECOND)); 
	}
}
// 날짜 요소를 일일히 문자열로 formatting 하는 것은 매우 귀찮다.
// 그래서 날짜와 시간을 보기 좋게 문자열로 변환하는 SimpleDateFormat 도우미 클래스가 제공된다.
// 자바정복 385페이지 참조