package chapter16;

import java.time.LocalDate;

public class Day100 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate after100 = today.plusDays(100);
		System.out.printf("100일 후는 %d월 %d일입니다.",
				after100.getMonthValue(),
				after100.getDayOfMonth());
	}
}
