package day04;

import java.util.Random;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * 가위바위보 게임
		 * 가위 : 0, 바위: 1, 보: 2
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int user =0, com=0;
		
		
		String[] choice = {"rock","scissors", "paper"};
		
		System.out.println("====Rock! Scissors! Paper!====");
		System.out.println("Exit the game... enter 4");
		
		
		do {
			com = (int)(Math.random()*3);
			System.out.println("1. Rock");
			System.out.println("2. Scissors");
			System.out.println("3. Paper");
			System.out.print(">>");
			
			
			user = sc.nextInt();
			
			
			switch (user) {
			case 1:
				if(com==0) {
					System.out.println("computer:"+choice[com]+"\nyou:"+choice[user-1]+"\n\nTied");
				}else if(com==1){
					System.out.println("computer:"+choice[com]+"\nyou:"+choice[user-1]+"\n\nYou win!");
				}else {
					System.out.println("computer:"+choice[com]+"\nyou:"+choice[user-1]+"\n\nYou lose :(");
				}
				break;
				
			case 2:
				if(com==0) {
					System.out.println("computer:"+choice[com]+"\nyou:"+choice[user-1]+"\n\nYou lose :(");
				}else if(com==1){
					System.out.println("computer:"+choice[com]+"\nyou:"+choice[user-1]+"\n\nTied");
				}else {
					System.out.println("computer:"+choice[com]+"\nyou:"+choice[user-1]+"\n\nYou win!");
				}
				break;
				
			case 3:
				if(com==0) {
					System.out.println("computer:"+choice[com]+"\nyou:"+choice[user-1]+"\n\nYou win!");
				}else if(com==1){
					System.out.println("computer:"+choice[com]+"\nyou:"+choice[user-1]+"\n\nYou lose :(");
				}else {
					System.out.println("computer:"+choice[com]+"\nyou:"+choice[user-1]+"\n\nTied");
				}
				
				break;

			default:
				System.out.println("game over...");
				break;
			}
			
			System.out.println();
			
		}while(user<4&&user>0);
		
			
		
		

		
		
		
		
		
		
		
		
		

	}

}
