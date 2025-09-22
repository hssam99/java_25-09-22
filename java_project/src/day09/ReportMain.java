package day09;

import java.util.Scanner;



public class ReportMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생수>");
		int total = sc.nextInt();
		
		Report[] report = new Report[total]; // 학생 배열 생성
		
		for(int i=0; i<total; i++) {
			System.out.println("---학생"+(i+1)+"report---");
			System.out.print("이름>");
			String name = sc.next();
			System.out.print("국어>");
			int kr = sc.nextInt();
			System.out.print("영어>");
			int eng = sc.nextInt();
			System.out.print("수학>");
			int math = sc.nextInt();
			Report r = new Report(name, kr,eng,math);
			report[i] = r;
		}
		
		
		for(Report r1 : report) {
			for(Report r2 : report) {
				if(r1.avg()<r2.avg()) {
					r1.setRank(r1.getRank()+1);
				}
			}
		}
		
		
		
		// 출력
		System.out.println("====성적====");
		System.out.println("이름\t"+"국어\t"+"영어\t"+"수학\t"+"합계\t"+"평균\t"+"등수");
		System.out.println("-------------------------------------------------------");
		for(Report r : report) {
			r.printReport();
		}
		
		
		
		
	}

}
