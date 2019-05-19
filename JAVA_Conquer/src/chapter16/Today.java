package chapter16;
// Date 클래스는 이미 폐기되었지만, 중간 타입으로는 사용된다.

import java.util.GregorianCalendar;
import java.text.SimpleDateFormat; // util 아님

public class Today {
	public static void main(String[] args) {
		GregorianCalendar today = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 a hh:mm:ss");
		String result = sdf.format(today.getTime());
		System.out.println(result);
	}
}
