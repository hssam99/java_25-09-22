package day92;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		char op;
		//String op; // ch
		
		System.out.print("input num1>>");
		num1 = sc.nextInt();
		System.out.print("input num2>>");
		num2 = sc.nextInt();
		System.out.print("input operator>>");
		//op = sc.next();
		op = sc.next().charAt(0); // charAt String 메소드 String의 제일 첫번째 번지를 가지고옴, 버퍼제거 효과 동반
		
		switch (op) {
		case '+':
			System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
			break;
		case '-':
			System.out.printf("%d-%d=%d\n", num1, num2, num1-num2);
			break;
		case '/':
			if(num1==0||num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}
			System.out.printf("%d/%d=%d\n", num1, num2, (double)(num1/num2));
			break;
		case '%':
			if(num1==0||num2==0) {
				System.out.println("피연산자가 0일 수 없습니다.");
				return;
			}
			System.out.printf("%d%%%d=%d\n", num1, num2, num1%num2);
			break;
		case '*':
			System.out.printf("%d*%d=%d\n", num1, num2, num1*num2);
			break;

		default:
			System.out.println("Error! wrong operator inserted.");
			break;
		}
	
		
		

	}

}
