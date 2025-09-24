package day02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("태어난 년도를 입력하세요: ");
		int year = sc.nextInt();
		
		final int CURRENT = 2025;
		int age = CURRENT - year+1;
		
		if(age<=13) {
			System.out.println(age+"세 어린이입니다. 입장료는 5,000원입니다.");
		}else if(age<=19) {
			System.out.println(age+"세 청소년입니다. 입장료는 7,000원입니다.");
		}else {
			System.out.println(age+"세 어른입니다. 입장료는 10,000원입니다.");
		}
		
		
		

	}

}
