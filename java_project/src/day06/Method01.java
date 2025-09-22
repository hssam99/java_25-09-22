package day06;

public class Method01 {

	// 메소드 생성 가능 위치
	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// main
		// class : 변수(가지는 요소), 메소드(해야하는 기능)

		// static method 호출
//		int s = sum(100,200);
//		System.out.println(s);

		// static이 아닌 메소드 호출
		// 클래스를 객체화 > new 키워드
		Method01 me = new Method01();
		int me2 = me.sum(1000, 2000);
		System.out.println(me);

		
		
		int s = me.sub(100,60);
		
	}

}
