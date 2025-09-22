package day10;

public class Super01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 상속: 부모의 것을 자식에게 물려주는것
		/*
		 * 
		 * - 멤버변수와 메소드만 상속가능
		 * - 클래스를 상속할 수 없음
		 * - 사용이유: 재사용을 해서 코드 중복을 제거하고 유지보수를 쉽게 하기 위해서
		 * 
		 * class A extends B
		 * 
		 * 
		 */

		B b = new B();
		// a, b, num만 가능
		b.setA(1000);
		b.setB(2000);
		b.num= 10000;
		b.print();
		
		System.out.println();
		
		
		A a = new A();
		a.setA(10);
		a.setB(20);
		a.num = 10; // 접근 제어자가 protected라서 직접 접근 가능
		a.print();
		System.out.println();
		a.setC(100);
		a.setD(200);
		a.setE(300);
		a.print();
		

	}

}

// 자식 클래스
class A extends B {

	private int c, d, e;
	
	
	// overide: 부모의 메소드를 재정의하여 사용하는 것
	// super: 부모의 값을 가져올 때 키워드
	// this: 내 멤버, 메소드를 지칭할 때 사용하는 키워드
	

	@Override
	public void print() {
		super.print();
		System.out.println("c:"+c+", d:"+d+", e: "+e);
	}
	
	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}
}

// 부모 클래스
class B {

	private int a, b; // 나만 사용 가능
	protected int num; // 상속 가능한 변수

	public void print() {
		System.out.println("a=>" + a + ", b=>" + b);
		System.out.println("num =>" + num);

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "B [a=" + a + ", b=" + b + ", num=" + num + "]";
	}

}