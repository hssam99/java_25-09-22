package day07;

public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 클래스의 구성요소: 멤버변수, 메소드, 생성자
		 * 
		 * 클래스: 객체를 생성하기 위한 설계도
		 * 객체는 new 를 사용하여 생성한다 
		 * 멤버변수: 해당클래스의 속성
		 * 메소드 : 클래스의 기능
		 * 
		 * 
		 */
		
		
		
		
		// 접근제어자
		/*
		 * public : 모두
		 * protected : 나 + 패키지 + 자식클래스 (상속시 사용)
		 * (default) : 나 + 패키지
		 * private : 나
		 * 
		 * 
		 * 일반적으로 하나의 파일에 하나의 클래스 사용 (여러가지 만들수 있으나 이례적)
		 * 클래스에서 public을 앞에 붙일 수 있는 클래스는 파일명 클래스 뿐. public class Class01만 public 가능
		 * 멤버변수, 메소드, 클래스 모두 접근제어자 사용
		 * 멤버변수는 private, 메소드는 public 선언이 일반적
		 * 멤버변수가 private면 다른 클래스에서 접근 불가능
		 * 멤버변수를 다른 클래스에서 접근 가능하도록 메소드를 만들어 사용 (getter/setter)
		 * 
		 */
		
		Test t = new Test();
		
//		t.x=10;
//		t.y=20;
		
		System.out.println(t.getX()+t.getY());
		

	}

}


class Test{
	
	// 클래스 멤버변수는 자동 초기화
	// int > 0 / String > null
	private int x;
	private int y;
	
	// getter
	public int getX() {
		return this.x;
	}
	
	// getter
	public int getY() {
		return this.y;
	}
	
	
}
