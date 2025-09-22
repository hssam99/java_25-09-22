package day06;

public class Method02 {
	
	// static 남발하면 안좋음
	
	public int sum1(int num1, int num2) {
		return num1+num2;
	}
	
	public void sum2(int num1, int num2) {
		int sum = sum1(10,20); // static 없는 메소드들은 서로 호출이 가능하다
		System.out.println(sum);
	}
	
	
	
	public static void main(String[] args) {
		Method02 me = new Method02();
		
		System.out.println(me.sum1(100, 200));
		me.sum2(100, 200);
		
		

	}

}
