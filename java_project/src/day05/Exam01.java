package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 야구게임
		 * 컴퓨터가 랜덤으로 3자리의 숫자를 생성
		 * 각 자리 수 0~9 중복 불가능
		 * 배열로 저장(랜덤)(중복 불가능)
		 * 유저가 3자리를 맞추는 게임
		 * 자리와 숫자가 같이 일치하면 strike
		 * 자리는 불일치 숫자만 일치하면 ball
		 * 아무것도 안맞으면 out
		 */
		
		
		
		System.out.println("====baseball game!====");
		System.out.println("ready...");
		System.out.println("Play!");
		
		
		int[] com = new int[3];
		com[0] = (int)(Math.random()*9)+1; // 첫번째 수 랜덤 지정 
		
		for(int i=1;i<com.length;i++) {
			com[i] = (int)(Math.random()*10); // 2~3번째 수 랜덤 지정
			for(int j=0;j<com.length;j++) {
				if(i==j) {
					continue; // 같은 자리 비교 X 
				}
				if(com[i]==com[j]) {
					com[i] = (int)(Math.random()*10); // 중복일 경우 재추첨
					i--;
				}
				
			}
		}
		
		//System.out.println(Arrays.toString(com)); // 컴퓨터 랜덤 수
		
		
		Scanner sc = new Scanner(System.in);
		do {
			int[] user = new int[3];
			
			System.out.print("input >> ");
			for(int i=0; i<user.length;i++) {
				user[i] = sc.nextInt();
			}
			
			//String[] userStr = user.split("");
			
			//System.out.println(Arrays.toString(user));
			
			
			// strike
			int strike=0;
			for(int i=0; i<com.length; i++) {
				if(com[i]==user[i]) {
					strike++;
				}
			}
			
			
			//ball
			int ball = 0;
			for(int i=0;i<com.length;i++) {
				for(int j=0;j<com.length;j++) {
					if(i==j) {
						continue; // strike 제거
					}
					
					if(com[i]==user[j]) {
						ball++;
					}
				}
				
			}
			
			
			
			if(strike!=0) {
				System.out.println(strike+"strike");
			}
			
			if(ball!=0) {
				System.out.println(ball+"ball");
			}

			if(strike==0&&ball==0) {
				System.out.println("out");
			}
			
			if(strike==3) {
				break;
			}
			
			
		}while(true);
		
		

	}

}
