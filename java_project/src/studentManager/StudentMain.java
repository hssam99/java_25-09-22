package studentManager;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * --메뉴--
		 * 1. 학생 등록 
		 * 2. 학생리스트 출력
		 * 3. 학생검색(학생정보, 수강정보)
		 * 4. 수강신청(한 학생에 대한)
		 * 5. 수강철회(한 학생에 대한)
		 * 6. 종료
		 */
		
		Scanner sc = new Scanner(System.in);
		StudentController stdCon  = new StudentController();
		stdCon.makeSubjectList();
		stdCon.makeStudentList(); // 학생정보 미리 등록
		
		int menu = 0;
		do {
			
			menu = stdCon.menuPrint(sc);
			
			switch(menu) {
			case 1: stdCon.insertStudent(sc); break;
			case 2: stdCon.printStudent(); break;
//			case 3: stdCon.searchStudent(sc); break;
			case 3: stdCon.searchStudentInfo(sc); break;
			case 4: stdCon.updateStudent(sc); break;
			case 5: stdCon.deleteStudent(sc); break;
			case 6: stdCon.insertSubject(sc); break;
			case 7: stdCon.deleteSubject(sc); break;
			case 8: stdCon.subjectStudentList(sc); break;
			case 9: System.out.println("종료합니다."); break;
			default: System.out.println("잘못된 메뉴");
			}
			
		}while(menu != 9);
		

		
		sc.close();
		
		
//		Scanner sc = new Scanner(System.in);
//		StudentController stdCon  = new StudentController();
//		stdCon.makeSubjectList();
//		stdCon.makeStudentList(); // 학생정보 미리 등록
//		
//		int menu = 0;
//		do {
//			
//			menu = stdCon.menuPrint(sc);
//			
//			switch(menu) {
//			case 1: stdCon.insertStudent(sc); break;
//			case 2: stdCon.printStudent(); break;
//			case 3: stdCon.searchStudent(sc); break;
//			case 4: stdCon.searchStudentInfo(sc); break;
//			case 5: stdCon.insertSubject(sc); break;
//			case 6: stdCon.deleteSubject(sc); break;
//			case 7: System.out.println("종료합니다."); break;
//			default: System.out.println("잘못된 메뉴");
//			}
//			
//		}while(menu != 7);
//		
//
//		
//		sc.close();
		
		

	}

}
