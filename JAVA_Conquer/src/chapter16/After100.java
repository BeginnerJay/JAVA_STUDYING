package chapter16;
// 에폭 타임을 연산하기 위한 메서드
// void add(int field, int amount) <- 자리가 넘치면 다음 단위로 넘겨준다.
// void roll(int field, int amount) <- 자리 넘침을 처리하지 않고, 지정한 요소만 증감시킴

import java.util.GregorianCalendar;
import java.util.Calendar;

public class After100 {
	public static void main(String[] args) {
		GregorianCalendar today = new GregorianCalendar();
		System.out.printf("오늘 날짜 : %d월 %d일\n",
				today.get(Calendar.MONTH) + 1, 
				today.get(Calendar.DATE));
		today.add(Calendar.DATE, 100);
		System.out.printf("100일 후는 %d월 %d일입니다.\n",
				today.get(Calendar.MONTH) + 1, 
				today.get(Calendar.DATE));
		today.roll(Calendar.DATE, 100);
		System.out.printf("100일을 돌리면 %d월 %d일입니다.\n",
				today.get(Calendar.MONTH) + 1, 
				today.get(Calendar.DATE));
	}
}
