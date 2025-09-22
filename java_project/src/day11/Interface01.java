package day11;

public class Interface01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 인터페이스 interface
		 * - 기능요약서: 매뉴얼 확인
		 * - 자체적으로 사용할 수 없고, 인터페이스를 구현한 클래스로 활용
		 * - 구현 키워드 : implements
		 * - 인터페이스는 멤버변수가 없다 
		 */
		
		
		Tv tv1 = new Tv();
		tv1.turnOn();
		tv1.volUp();
		tv1.volUp();
		tv1.volDown();
		tv1.turnOff();
		
	}

}


interface Power {
	abstract void turnOn();
	abstract void turnOff();
}


interface Remocon{
	void volUp();
	void volDown();
}




// 상속과 구현을 동시에 해야할 경우

//class Tv2 extends A implements B{}


class Tv implements Power, Remocon{
	private int vol;
	private boolean power;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		power=true;
		System.out.println("Tv on");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		power=false;
		System.out.println("Tv off");
		
	}

	@Override
	public void volUp() {
		// TODO Auto-generated method stub
		vol++;
		System.out.println("vol: "+vol);
		
	}

	@Override
	public void volDown() {
		// TODO Auto-generated method stub
		vol--;
		System.out.println("vol: "+vol);
		
	}
	
}