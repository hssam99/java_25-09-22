package day02;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("input your age>>");
		int inputAge = scan.nextInt();
		
		
		if(inputAge<=13) {
			System.out.println("children");
		}else if(inputAge<=19) {
			System.out.println("youth");
		}else {
			System.out.println("adult");
		}
		

	}

}
