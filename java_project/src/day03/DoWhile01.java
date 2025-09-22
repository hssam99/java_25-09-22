package day03;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("======menu======");
			System.out.println("1. 저장하기");
			System.out.println("2. 새로 만들기");
			System.out.println("3. 종료하기");
			
			int menu = sc.nextInt();
			
			
			switch (menu) {
			case 1:
				System.out.println("저장되었습니다.");
				break;
			case 2:
				System.out.println("생성되었습니다.");
				break;
			case 3:
				System.out.println("종료되었습니다.");
				return;

			default:
				break;
			}
			
		}while(true);
		
		

	}

}
