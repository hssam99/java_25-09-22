package day04;

public class StringEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 주민등록번호를 참고하여 생년월일과 성별을 출력하시오
		
		String regNum = "990101-1234567";
		String regNum2 = "010101-3876543";
		String gender;
		
		int idx_hypen = regNum.indexOf("-"); // -의 주소값
		String rNum = regNum.substring(0,idx_hypen); // 생년월일
		
		
		// 성별
		if(regNum.charAt(idx_hypen+1)=='1') {
			gender = "male";
		}else {
			gender = "female";
		}
		
		
		
		
		
		
		
		
		System.out.println(gender);
		
		
		
	
//		String birthdate = (regNum1.substring(0,regNum1.indexOf("-"))); // 990101
//		String gender = (regNum1.substring(regNum1.indexOf("-"))); //
//		
//		//System.out.println(gender); // 1
//		
//		
//		int year = Integer.parseInt(birthdate.substring(0,2)); // 99
//		int month = Integer.parseInt(birthdate.substring(2,4)); // 01
//		int date = Integer.parseInt(birthdate.substring(4,6)); // 01
//		int age = (100-(Integer.parseInt(regNum1.substring(0,2)))+25); // 00년생 이전 나이 계산
//		// 100-99+25
//	
//		
//		if(year<20) {
//			if(gender.charAt(1)=='1') {
//				System.out.println("20"+birthdate.substring(0,2)+"년 "+month+"월 "+date+"일생입니다. "+age+"살 남자입니다.");
//			}else {
//				System.out.println("20"+birthdate.substring(0,2)+"년 "+month+"월 "+date+"일 생입니다. "+age+"살 여자입니다.");
//			}
//		}else {
//			if(gender.charAt(1)=='1') {
//				System.out.println("19"+year+"년 "+month+"월 "+date+"일 생입니다. "+age+"살 남자입니다.");
//			}else {
//				System.out.println("19"+year+"년 "+month+"월 "+date+"일 생입니다. "+age+"살 여자입니다.");
//			}
//		}
//		
//		
//		// 19+99 > concat 사용
//		
//		
//		birthdate = (regNum2.substring(0,regNum2.indexOf("-"))); // 010101
//		gender = (regNum2.substring(regNum2.indexOf("-"))); //
//		
//
//		year = Integer.parseInt(birthdate.substring(0,2)); // 00
//		month = Integer.parseInt(birthdate.substring(2,4)); // 01
//		date = Integer.parseInt(birthdate.substring(4,6)); // 01
//		age = (25-(Integer.parseInt(regNum2.substring(0,2)))); // 00년생 이후 나이 계산
//
//		
//		
//		if(year<20) {
//			if(gender.charAt(1)=='1') {
//				System.out.println("20"+birthdate.substring(0,2)+"년 "+month+"월 "+date+"일생입니다. "+age+"살 남자입니다.");
//			}else {
//				System.out.println("20"+birthdate.substring(0,2)+"년 "+month+"월 "+date+"일 생입니다. "+age+"살 여자입니다.");
//			}
//		}else {
//			if(gender.charAt(1)=='1') {
//				System.out.println("19"+year+"년 "+month+"월 "+date+"일 생입니다. "+age+"살 남자입니다.");
//			}else {
//				System.out.println("19"+year+"년 "+month+"월 "+date+"일 생입니다. "+age+"살 여자입니다.");
//			}
//		}
//		
				
		
		

	}

}
