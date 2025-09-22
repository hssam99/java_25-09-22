package java_project;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		int b = 2;
		a+=b; // a = a+b;
		//System.out.println(a); // 3
		
		int c = 0;
		//System.out.println(c++); //0
		//System.out.println(++c); //2
		
		
		
		// % - 나머지 
		// + 숫자가 아닐때는 연결연산자로 바뀝니다.
		
		
		/*
		 * 
		 * 정수/정수 = 정수
		 * 정수 / 실수 = 실수 
		 * 실수 / 실수 = 실수
		 * 정수로만 이루어져 있을 때 정수값이 나온다
		 * 
		 */
		
		
		// 정수 / 0 > exception 발생
		// 실수 / 0 > infinity 발생
		
		
		//System.out.println(5/0); //java.lang.ArithmeticException: / by zero
		//System.out.println(5.0/0); // infinity
		
		
		// 논리연산자 &&(and) ||(or) !(not)
		//System.out.println(3>4||5<6); // true
		//System.out.println(3>2?"3 is bigger than 2":"3 is smaller than 2");
		
		
	
		
		
		// Q1
		Scanner input = new Scanner(System.in);
		System.out.print("input>>");
		
		int num = input.nextInt();
	
		System.out.println(num%2==0?"even":"odd");
		
		
		System.out.println("--using boolean--");
		
		boolean result = num%2==0;
		System.out.println((result)?"even":"odd");
		
	
		
		
		
		
	}

}
