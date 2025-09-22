package day03;

import java.util.Scanner;

public class For07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 숫자 입력 받고 소수인지 아닌지 판별 
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("insert the number >>");
		int input = sc.nextInt();
		
		
		int cnt = 0;
		
		
		for(int i=1;i<=input;i++) {
			if(input%i==0) {
			cnt++;
			}
		}
		
		if(cnt==2) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("소수가 아닙니다.");
		}
		
		
		
	}

}
