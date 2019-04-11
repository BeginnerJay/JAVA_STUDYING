package chapter5;

import java.util.Calendar;

class MyDate {
	private int day;
	private int month;
	private int year;
	private boolean isValid;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	} // 한번에 일, 월, 연 다 넣는 생성자 생성
	// public 메서드이기 때문에 private 변수에 접근 가능


	public int getDay() // get 메서드 생성
	{
		return day;
	}

	public void setDay(int day)
	{
		switch (month)
		{
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if (day > 31 || day <= 0)
			{
				isValid = false;
			}
			else
			{
				this.day = day;
			}
			break;

			case 4: case 6: case 9: case 11:
			if (day > 30 || day <= 0)
			{
				isValid = false;
			}
			else
			{
				this.day = day;
			}
			break;

			case 2:
				if ((year%4 == 0 && year%100 != 0) || year%400 == 0)
				{ // 윤년
					if (day > 29 || day <= 0)
					{
						isValid = false;
					}
					else
					{
						this.day = day;
					}
				}
				else
				{
					if (day > 28 || day <= 0)
					{
						isValid = false;
					}
					else
					{
						this.day = day;
					}
				}
				break;

			default:
				isValid = false;
		}
	}


	public int getMonth()
	{
		return month;
	}

	public void setMonth(int month)
	{
		if (month < 1 || month > 12)
		{
			isValid = false;
		}
		else
		{
			this.month = month;
		}

	}


	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		if (year > Calendar.getInstance().get(Calendar.YEAR))
		{
			this.year = year; // ex) 2024년
		}
		else
		{
			this.year = year;
		}
	}


	public String isValid()
	{

		if(isValid == true)
		{
			return "유효한 날짜입니다.";
		}
		else
		{
			return "유효하지 않은 날짜입니다.";
		}
	}
	public MyDate() {} // 디폴트 생성자 생성



}






/*
생성자 인수 이름과 멤버 이름이 동일한 경우 멤버임을 분명히 하기 위
해 this.을 앞에 붙인다.
Car(String name, boolean gasoline) {
this.name = name;
this.gasoline = gasoline;
}
*/