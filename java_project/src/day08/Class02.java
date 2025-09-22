package day08;

public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t = new Test();
		
		// 멤버변수 private 아니기 때문에 사용 가능
//		t.x = 1;
//		t.y = 2;
		
		t.setX(10);
		t.setY(20);
		t.getX();
		t.getY();
		
		System.out.println("("+t.getX()+","+t.getY()+")");

	}

}





// 한 파일에 같은 클래스명을 사용 할 수 없음
// 한 패키지 안에 같은 클래스명을 사용 할 수 없음
// 패키지가 다르면 가능하다.
//Class02{
//	
//	
//}


class Test{
	private int x;
	private int y;
//	int x;
//	int y;
	
	// private의 멤버변수 사용하기 위해서는 getter, setter 메소드 필요
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	
}