package day09;

public class StudentCourse {
	private int courseName;
	private int date;
	
	
	/*
	 * 
	 * course
	 * 1. JAVA
	 * 2. 웹개발국비
	 * 3. DB
	 * 
	 * 
	 * date
	 * 1. 2025-08-01 ~ 2025-08-30
	 * 2. 2025-08-26 ~ 2026-02-14
	 * 3. 2025-09-15 ~ 2025-10-15
	 * 
	 */
	
	
	
	
	//method
	
	public String printCoursName() {
		switch (courseName) {
		case 1:
			return "JAVA";
		case 2:
			return "DB";
		case 3:
			return "javaScript";
		case 4:
			return "python";
		case 5:
			return "C";
		case 6:
			return "웹국기";

		default:
			return "수강 정보가 없습니다.";

		}
		
	}
	
	
	public String printDate() {
		switch (date) {
		case 1:
			return "2025-08-01 ~ 2025-08-30";
		case 2:
			return "2025-08-26 ~ 2026-02-14";
		case 3:
			return "2025-09-15 ~ 2025-10-15";

		default:
			return "수강 정보가 없습니다.";

		}
		
	}
	
	
	
	
	
	public int getCourseName() {
		return courseName;
	}
	public void setCourseName(int courseName) {
		this.courseName = courseName;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		return "StudentCourse [courseName=" + courseName + ", date=" + date + "]";
	}
	
	
	
	

}
