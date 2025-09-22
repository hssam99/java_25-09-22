package day06;

public class Method03 {
	// 메소드 정의
	// 기능을 정의하는 역할
	// 접근제어자 리턴타입 메소드명 (매개변수);
	/*
	 * 접근제어자 : public, private...
	 * 리턴타입 : void, int, double ...
	 * 메소드명 : sum, sub, ...
	 * 매개변수 : 자료형과 함께!
	 * 
	 * 클래스에서 메소드를 사용하려면 해당 메소드를 가지고 있는 클래스를 객체화(instance) 해야함.
	 * ex) sum 메소드를 가지고 있는 Method03 클래스를 객체화해야 sum 메소드를 사용할 수 있음.
	 * 객체화 하지 않으려면 static을 사용해야함.
	 * 
	 */
	
	
	// method
	
	public int sum(int num1, int num2) {
		//System.out.println(num1+num2);
		return num1+num2;
	}
	public int sub(int num1, int num2) {
		//System.out.println(num1-num2);
		return num1-num2;
	}
	public int mul(int num1, int num2) {
		//System.out.println(num1*num2);
		return num1*num2;
	}
	public double div(int num1, int num2) {
		if(num2==0) {
			return -9999999;
		}
		//System.out.println(num1/num2);
		return (double)num1/num2;
	}
	public int mod(int num1, int num2) {
		if(num2==0) {
			return -9999999;	
		}
		//System.out.println(num1%num2);
		return num1%num2;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// + - * / % 기능을 하는 메소드를 생성
		// main에서 호출 > 출력
		
		int num1=10, num2=20;
		
		Method03 m3 = new Method03();
		System.out.println(m3.sum(num1,num2));
		System.out.println(m3.sub(num1,num2));
		System.out.println(m3.mul(num1,num2));
		System.out.println(m3.div(num1,num2));
		System.out.println(m3.mod(num1,num2));
		
//		m3.sum(10,20);
//		m3.sub(10,20);
//		m3.mul(10,20);
//		m3.div(10,20);
//		m3.mod(10,20);

		
	}

}
