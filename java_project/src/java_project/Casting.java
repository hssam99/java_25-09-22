package java_project;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//auto casting
		// byte<short<char<int<long
		//float<double
		
		//auto casting
		byte a = 10;
		short sh = a;
		
		
		int in = 1;
		//a = in; // in은 4바이트, a는 1바이트 >> error!
		
		a = (byte)in; // 강제형변환
		
	
		// 왼쪽이 오른쪽보다 항상 더 큰 범위의 자료형이어야한다.
		
		
		// 문자를 숫자로 Str

		
		
		
	}

}
