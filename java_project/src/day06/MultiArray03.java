package day06;

import java.util.Scanner;

public class MultiArray03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 성적표
	      /* 테스트 참가인원 > 3
	       * 이름      국어      영어      수학      합계      평균       등수 \t
	       * hong      89      85      75      00      00      00
	       * kim      89      85      75      00      00      00
	       * lee      89      85      75      00      00      00
	       * */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("테스트 참가인원 >");
		int row = sc.nextInt();
		int col = 7;
		
		String[][] arr = new String[row][col];
		
		for(int i=0; i<row;i++) {
			int sum = 0;
			double avg = 0;
			System.out.print("학생의 이름을 입력하세요> ");
			arr[i][0] = sc.next();
			System.out.println(arr[i][0]+"의 성적을 입력하세요...");


			for(int j=1;j<4;j++) {
				
				switch (j) {
				case 1:
					System.out.print("국어 점수>");
					break;
				case 2:
					System.out.print("영어 점수>");
					break;
				case 3:
					System.out.print("수학 점수>");
					break;

				default:
					break;
				}
				

				arr[i][j] = sc.next();
				Integer num = Integer.valueOf(arr[i][j]);
				sum +=num;
			}
			
			arr[i][4] = String.valueOf(sum);
			avg = Math.round(((double)sum/3)*100)/100.0; // 평균 소수 2번째까지 저장
			arr[i][5] = String.valueOf(avg);
		}
		
		
		// 등수
		
		for(int i=0;i<row;i++) {
			int rank=1; // 모든 학생 등수 1로 초기화
			
			for(int j=0;j<row;j++) {
				// 점수 비교
				if(i==j) {
					continue;
				}
				
				if(Double.valueOf(arr[i][5]) < Double.valueOf(arr[j][5]) ) {
					rank++;
				}
				
			}
			arr[i][6] = String.valueOf(rank);
		}
		
		// 출력
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		
		for(String[] r : arr ) {
			for(String c : r) {
				System.out.print(c+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		

	}

}
