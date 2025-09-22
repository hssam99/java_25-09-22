package studentManager;

public class Subject {
	/*
	 * - 수강 클래스 (Subject)
	 * - 멤버변수 : 과목코드, 과목명, 수강기간, 시수, 강사명, 강의장...
	 * - 하나의 수강클래스를 출력하는 메서드
	 */
	
	private String subId; // 과목코드
	private String subName; // 과목명
	private String subDate; // 수강 기간
	private String subTime; // 수강 시간
	private String subProf; // 강사명
	private String subPlace; // 강의장
	
	
	

	public Subject() {}
	
	public Subject(String id, String name, String date, String time, String prof, String place) {
		this.subId=id;
		this.subName = name;
		this.subDate=date;
		this.subTime=time;
		this.subProf=prof;
		this.subPlace=place;
	}
	
	public Subject(Subject sub) {
		this.subId=sub.getSubId();
		this.subName = sub.getSubName();
		this.subDate=sub.getSubDate();
		this.subTime=sub.getSubTime();
		this.subProf=sub.getSubProf();
		this.subPlace=sub.getSubPlace();
	}
	
	
	//하나의 강좌 정보 출력
	public void printSubjectInfo() {
		System.out.println(getSubId()+"\t"+ getSubName()+"\t"+getSubDate()+"\t"+
							getSubTime()+"\t"+getSubProf()+"\t"+getSubPlace());
	}
	
	
	
	public String getSubId() {
		return subId;
	}
	public void setSubId(String subId) {
		this.subId = subId;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getSubDate() {
		return subDate;
	}
	public void setSubDate(String subDate) {
		this.subDate = subDate;
	}
	public String getSubTime() {
		return subTime;
	}
	public void setSubTime(String subTime) {
		this.subTime = subTime;
	}
	public String getSubProf() {
		return subProf;
	}
	public void setSubProf(String subProf) {
		this.subProf = subProf;
	}
	public String getSubPlace() {
		return subPlace;
	}
	public void setSubPlace(String subPlace) {
		this.subPlace = subPlace;
	}
	
	
	
	@Override
	public String toString() {
		return "Subject [subId=" + subId + ", subName=" + subName + ", subDate=" + subDate + ", subTime=" + subTime
				+ ", subProf=" + subProf + ", subPlace=" + subPlace + "]";
	}
	
	
	
	
	
	
	


}
