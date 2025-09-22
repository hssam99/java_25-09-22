package day03;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 1~50 랜덤수 생성
		 * 
		 */
	
		int rdNum = (int)(Math.random()*50+1);
		//System.out.println(rdNum);
		int userNum=0;
		int cnt = 0;
		//System.out.println(rdNum);
		
		Scanner sc = new Scanner(System.in);
		
		while(cnt<5) {
			System.out.print("guess the number >> ");
			userNum = sc.nextInt();
			
			cnt++;
			
			if(userNum>rdNum) {
				System.out.println("down!");
				System.out.println("남은기회: "+(5-cnt));
			}else if(userNum<rdNum){
				System.out.println("up!");
				System.out.println("남은기회: "+(5-cnt));
			}else {
				System.out.println("Correct!");
				System.out.println("Game Over!");
				return;
			}
		}
		
		System.out.println("You fail... Game Over!");
		

		
		

	}

}
