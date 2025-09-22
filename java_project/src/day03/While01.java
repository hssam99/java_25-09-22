package day03;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * while (true) {
		 * 		조건식이 바뀔 수 있는 요소가 있어야 무한 루프에 빠지지 않음
		 *		실행 구문
		 * }
		 * for > 실행횟수 정해져있을때
		 * while > 조건 기준 무한 반복 > break;
		 * 
		 * 
		 */
		
		
		System.out.println("for");
		

		for(int i=0; i<=10;i++) {
			System.out.println(i);
		}
		
		
		System.out.println("while");
		
		
		int i =0;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		
		System.out.println("while even num");
		// 짝수만 while
		
		i=1;
		
		while(i<=10) {
			System.out.println(i);
			i+=2;
		}
		
		
		
		// 1~50 even
		
		
		System.out.println("test");
		
		i=2;
		while(i<=50) {
			if(i%10==0) {
				System.out.println(i+"\n");
			}else {
				System.out.print(i+"\t");
			}
			i+=2;
		}
		
		
		
		
		System.out.println("counting");
		
		i=2;
		int cnt = 1;
		while(i<=50) {
			System.out.print(i+"\t");
			
			if(cnt==5) {
				System.out.println("\n");
				cnt = 0;
			}
			i+=2;
			cnt++;
		}
		
		
		
		// 나이 입력
		
		System.out.println("age program");
		
		
		Scanner sc = new Scanner(System.in);
		int year=1901, input=0, age=0;
		
		
		while(year > 1900) {
			System.out.print("enter your birth year: ");
			input = sc.nextInt();
			age = 2025-input+1;
			if(input<1900) {
				System.out.println("유효하지 않은 년도입니다.");
			}else if(age<=13) {
				System.out.println(age+"세 어린이입니다. 입장료는 5,000원입니다.");
			}else if(age<=19) {
				System.out.println(age+"세 청소년입니다. 입장료는 7,000원입니다.");
			}else {
				System.out.println(age+"세 어른입니다. 입장료는 10,000원입니다.");
			}
		}
		
		
		

	}

}
