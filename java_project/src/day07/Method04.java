package day07;

public class Method04 {

	
	
//	구구단 메소드
	
	public void multi(int num) {
		System.out.println("---"+num+"단---");
		
		for(int i=1;i<=9;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method04 m4 = new Method04();
		
		m4.multi(2);
		m4.multi(9);
		

	}

}
