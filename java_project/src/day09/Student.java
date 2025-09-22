package day09;


public class Student {
	
	private String name;
	private String phNum;
	private String birth;
	private int age;
	private String depName;
	private String loc;
	private StudentCourse[] courseData = new StudentCourse[5]; // 학생 수강 정보 기록
	private int cnt=0;

	public Student() {

	}

	public Student(String name, String phNum) {
		this.name = name;
		this.phNum = phNum;
	}
	
	public Student(String name, String phNum, String birth, int age, String depName, String loc) {
		this(name, phNum);
		this.birth = birth;
		this.age = age;
		this.depName = depName;
		this.loc = loc;
	}

	
	
	//method
	
	public void addCourse(int course, int date) {
		if(cnt>4) {
			System.out.println("더 이상 등록할 수 없습니다."); // 5개 이상 등록시 error!
		}else{
			StudentCourse newCourse = new StudentCourse();
			newCourse.setCourseName(course);
			newCourse.setDate(date);
			courseData[cnt] = newCourse;
			cnt++;
		}
	}
	
	
	// 학생 정보 출력
	public void printStudentInfo() {
		System.out.println("============학생 정보============");
		System.out.println("이름:\t" + getName());
		System.out.println("번호:\t" + getPhNum());
		System.out.println("생년월일:\t" + getBirth());
		System.out.println("나이:\t" + getAge());
		System.out.println("학원명:\t" + getDepName());
		System.out.println("지점:\t" + getLoc());
		printCourse();
		System.out.println("===============================");
	}
	
//	public String printLoc() {
//		switch (loc) {
//		case 1:
//			return "강남";
//		case 2:
//			return "신촌";
//		case 3:
//			return "인천";
//		case 4:
//			return "대전";
//		case 5:
//			return "수원";
//
//		default:
//			return "정보가 없습니다";
//		}
//	}
	
	
	
	// 수강 정보 출력
	public void printCourse() {
		System.out.println("---------"+getName()+"의 수강정보---------");
		for(int i =0;i<cnt;i++) {
			System.out.println(courseData[i].printCoursName()+"\t"+courseData[i].printDate());
		}
	}
	
	
	
	// getter setter

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public String getPhNum() {
		return phNum;
	}

//	public void setPhNum(String phNum) {
//		this.phNum = phNum;
//	}

	public String getBirth() {
		return birth;
	}

//	public void setBirth(String birth) {
//		this.birth = birth;
//	}

	public int getAge() {
		return age;
	}

//	public void setAge(int age) {
//		this.age = age;
//	}

	public String getDepName() {
		return depName;
	}

//	public void setDepName(String depName) {
//		this.depName = depName;
//	}

	public String getLoc() {
		return loc;
	}
//
//	public void setLoc(int loc) {
//		this.loc = loc;
//	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", phNum=" + phNum + ", birth=" + birth + ", age=" + age + ", depName="
				+ depName + ", loc=" + loc + "]";
	}

}
