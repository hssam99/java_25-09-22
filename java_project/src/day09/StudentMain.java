package day09;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		//public Student(String name, String phNum, String birth, int age, String depName, String loc)
		Student[] std = new Student[5];
		std[0] = new Student("hong", "010-7103-5400", "1999.11.04", 25, "KOREAIT","강남");
		std[0].addCourse(1, 2);
		std[1] =new Student("kim", "010101", "010-2222-2222", 25, "KOREAIT","신촌");
		std[1].addCourse(2, 3);
		
		std[2] =new Student("lee", "010103", "010-3333-2222", 25, "KOREAIT","강남");
		std[2].addCourse(4, 2);
		std[2].addCourse(2, 3);
		std[2].addCourse(1, 1);
		
		std[3] =new Student("pack", "030801", "010-2222-5555", 22, "KOREAIT","인천");
		std[3].addCourse(1, 1);
		std[3].addCourse(5, 3);
		
		std[4] =new Student("choi", "020901", "010-9999-2222", 23, "KOREAIT","신촌");
		std[4].addCourse(1, 3);
		std[4].addCourse(3, 2);
		std[4].addCourse(4, 1);
		std[4].addCourse(1, 1);
//		int cnt = 0;
		
//		System.out.println("----전체 학생 정보----");
//		//학생정보와 지점 정보만 출력
//		for(Student tmp : std) {
//			tmp.printStudentInfo();
//		}
		
		String searchBranch = "강남";
		
		for(int i = 0; i<std.length;i++) {
			if(std[i].getLoc().equals(searchBranch)){
				std[i].printStudentInfo();
				}
			}
		

//		System.out.println("---지점 선택---");
//		System.out.println("1. 강남 2. 신촌 3. 인천 4. 대전 5. 수원");
//		System.out.print(">");
//		s1.setLoc(sc.nextInt());
//		
//		
//		do {
//			System.out.println("---과목 선택---");
//			System.out.println("1. JAVA");
//			System.out.println("2. DB");
//			System.out.println("3. javascript");
//			System.out.println("4. python");
//			System.out.println("5. C");
//			System.out.println("6. 웹국기");
//			System.out.print(">>");
//			int course = sc.nextInt();
//			
//			System.out.println("---기간 선택---");
//			System.out.println("1. 2025-08-01 ~ 2025-08-30");
//			System.out.println("2. 2025-08-26 ~ 2026-02-14");
//			System.out.println("3. 2025-09-15 ~ 2025-10-15");
//			System.out.print(">>");
//			int date = sc.nextInt();
//			
//			s1.addCourse(course, date);
//			cnt++;
//		}while(cnt<5);


//		s1.printStudentInfo();

	}

}
