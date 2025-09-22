package day13;

import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getMonth());
		
		// Deprecated(비권장)
		
		Calendar c = Calendar.getInstance(); // 알아서 객체를 만들어서 줄게
		System.out.println(c.get(Calendar.YEAR));
		int year = c.get(Calendar.YEAR);
		// 월은 0~11로 표현하기 때문에 +1을 해서 표기해야한다.
		System.out.println(c.get(Calendar.MONTH));
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DATE);
		int week = c.get(Calendar.WEEK_OF_MONTH);
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(c.get(Calendar.AM_PM));
		String[] ampmString = {"오전", "오후"};
		
//		System.out.println((ampm==1? "오후":"오전")+hour);

	}

}
