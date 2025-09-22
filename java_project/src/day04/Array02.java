package day04;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		int num = 0, sum = 0;
		
		while(num<5) {
			System.out.print("학생"+(num+1)+"의 점수를 입력하세요 >> ");
			score[num] = sc.nextInt();
			if(score[num]>100||score[num]<0) {
				System.out.println("잘못된 입력값입니다. 다시 입력하세요.");
				num--;
			}
			num++;
		}

		
		for(int i : score) {
			System.out.println(i);
		}
		
		for(int i : score) {
			sum +=i;
		}
		
		double avg = (double)(sum/score.length);
		
		
		System.out.println("합계: "+sum+" 평균: "+ avg);
		
		
	}

}
