package studentManager;

import java.util.Scanner;

public interface StudentProgram {
	
	/*
	 * 학생등록
	 * 학생리스트 출력
	 * 학생검색(학생정보, 수강정보)
	 * 수강신청
	 * 수강철회
	 * 
	 */
	
	void makeSubjectList();
	void insertStudent(Scanner scan);
	void makeStudentList(); // 디버깅용 미리 학생리스트 만들어두기
	void printStudent();
//	void searchStudent(Scanner scan); // 학생 검색
	int searchStudentID(String stdId); // 학생 학번 검색 메소드, 존재하지 않으면 -1 리턴
	void searchStudentInfo(Scanner scan); // 학생의 수강정보 출력
	void insertSubject(Scanner scan); // 한 학생에게 수강과목 등록
	void deleteSubject(Scanner scan); // 한 학생에게 수강과목 취소

}
