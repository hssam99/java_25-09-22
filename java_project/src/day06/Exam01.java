package day06;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 숫자 입력 후 합계 평균 출력
		 * 0, - 입력하면 프로그램 종료
		 * 3+5+4+8+9 0 = 합, 평균
		 */
		
		

		int input = 1, sum=0;
		double avg=0;
		int cnt = 0;
		String result = "";
		Scanner sc = new Scanner(System.in);
		
//		
//		[출력형식 String]
//		// + 기호 때문에 첫 숫자 별도 작성
//		System.out.print("input>>");
//		input = sc.nextInt();
//		
//		if(input>0) {
//			sum +=input;
//			String temp = Integer.toString(input);
//			result = result.concat(temp);
//			cnt++;
//		}else {
//			System.out.println("프로그램이 종료되었습니다.");
//			return;
//		}
//		
//		
//		
//		while(input>0) {
//			System.out.print("input>>");
//			input = sc.nextInt();
//
//			// 마지막 0 혹은 마이너스 안보이게 하고 싶으면 else 주석
//			if(input>0) {
//				sum +=input;
//				String temp = Integer.toString(input);
//				result = result.concat("+"+temp);
//				cnt++;
//			}else {
//				String temp = Integer.toString(input);
//				result = result.concat(" "+temp+" ");
//			}
//			
//		}
//		
//		avg = (double)sum/cnt;
//		System.out.println(result+"= "+sum+", 평균:"+sum+"/"+cnt+"="+avg);
		
		
		
//		[출력형식 배열]
		// arraycopy
		
		int[] num = new int[3];
		
		do {
			System.out.print("input>>");
			input = sc.nextInt();
			
			if(input<=0) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
			if(num.length==cnt) {
				int[] newNum = new int[num.length+3]; // Arraycopy
				System.arraycopy(num, 0, newNum, 0, num.length);
				num = newNum;
			}
			num[cnt] = input;
			sum +=input;
			cnt++;
			
		}while(input>0);
		
		if(cnt==0) {
			System.out.println("프로그램이 종료되었습니다.");
			return;
		}else{
			sum +=input;
			String temp = Integer.toString(input);
			result = result.concat(temp);
			cnt++;
			System.out.println("프로그램이 종료되었습니다.");
			return;
		}
		
		
		

	}

}
