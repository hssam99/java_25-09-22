package day03;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======계산기======");
		System.out.println("1. +");
		System.out.println("2. -");
		System.out.println("3. *");
		System.out.println("4. /");
		System.out.println("5. %");
		System.out.println("6. exit");
		
		
		do {

			System.out.print("두 수를 입력해주세요 >>");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.print("menu >>");
			int menu = sc.nextInt();
			
			
			switch (menu) {
			case 1:
				System.out.println(num1+"+"+num2+"="+(num1+num2));
				break;
			case 2:
				System.out.println(num1+"-"+num2+"="+(num1-num2));
				break;
			case 3:
				System.out.println(num1+"*"+num2+"="+(num1*num2));
				break;
			case 4:
				if(num2==0) {
					System.out.println("num2를 다시 입력해주세요");
					break;
				}
				System.out.println(num1+"/"+num2+"="+(num1/num2));
				break;
			case 5:
				if(num2==0) {
					System.out.println("num2를 다시 입력해주세요");
					break;
				}
				System.out.println(num1+"%"+num2+"="+(num1%num2));
				break;
			case 6:
				System.out.println("종료되었습니다.");
				return;

			default:
				break;
			}
			
		}while(true);

	}

}
