package day13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// LocalDateTime

		LocalDateTime today = LocalDateTime.now(); // 오늘날짜 리턴
		System.out.println(today);
		System.out.println(today.getYear());
		
		// 객체를 String으로 변환 toString()
		String date = today.toString();
		System.out.println(date);
		System.out.println(date.substring(0, date.indexOf("T"))); // ~T 전까지 출력
		LocalDate today2 = LocalDate.now(); // 위랑 같은 거
		System.out.println(today2);
		
		System.out.println();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		
		System.out.println(dtf.format(today));
		
		
		LocalDateTime birth = LocalDateTime.of(2009, 9, 30, 8, 30); // 날짜 생성
		System.out.println(dtf.format(birth));
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		
	}

}
