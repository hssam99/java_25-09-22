package day10;

public class Class04 {
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 초기값 우선순위
	 * 기본값 > 명시적 초기값 > 초기화 블럭
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
	}

}

class Student {
	private String gigum = "강남";
	private String name;
	private int age;
	
	
	{
		this.name = "미정";
		this.age = 20;
	}
	
	
	public Student() {
		
	}
}
