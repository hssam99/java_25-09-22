package day02;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan = new Scanner(System.in);
		
		int kor, eng, math, sum;
		double avg;
		String result;
		
		
		System.out.print("input kor score>> ");
		kor = scan.nextInt();
		System.out.print("input eng score>> ");
		eng = scan.nextInt();
		System.out.print("input math score>> ");
		math = scan.nextInt();
		
		if(kor<0||eng<0||math<0||kor>100||eng>100||math>100) {
		System.out.println("you put the wrong input. The score must be between 0 and 100.");
		return; // return 사용해서 프로그램 종료
	}
		
		// return; : 리턴 값을 주고 메소드 종료
		// method return void > 리턴값 없음 종료
		
		sum = kor+eng+math;
		avg = sum/3.0;
		
		if(avg>=80) {
			result = "pass";
		}else {
			result = "fail";
		}
		
		
		System.out.println("sum: "+sum+",avg: "+avg+",result: "+result);
		
		
		
//		sum = kor+eng+math;
//		avg = sum/3.0;
//		
//		if(avg>=80) {
//			result = "pass";
//		}else {
//			result = "fail";
//		}
//		
//		if(kor<0||eng<0||math<0) {
//			System.out.println("you put the wrong input. The score must be bigger than 0.");
//		}else if(kor>100||eng>100||math>100) {
//			System.out.println("you put the wrong input. The score must be under 100.");
//		}else{
//			System.out.println("sum: "+sum+",avg: "+avg+",result: "+result);
//		}
//		

		
		
		
		
	}

}
