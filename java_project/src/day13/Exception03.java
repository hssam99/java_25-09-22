package day13;

public class Exception03 {
	
	
	

	public static void main(String[] args) {
		
		
		Exception03 ex03 = new Exception03();
//		System.out.println(ex03.calc(4, 0, '+'));
//		System.out.println(ex03.calc(4, 0, '/')); // 이 뒤로 전부 실행 안됨
		

		try {
			System.out.println(ex03.calc(4, 0, '+'));
			System.out.println(ex03.calc(4, 0, '-'));
			System.out.println(ex03.calc(4, 0, '!'));
			System.out.println(ex03.calc(4, 0, '/'));
			System.out.println(ex03.calc(4, 0, '%'));
//			System.out.println(4 - 0);
//			System.out.println(4 / 0); // 여기서부터 코드 중지
//			System.out.println(4 % 0);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		System.out.println(4 * 0);
		System.out.println(4 + 0);
		
		
		
	}
	
	// 메소드에서 예외처리
	/*
	 * 두 정수를 입력받고, 연산자를 입력받아
	 * 4칙 연산의 결과를 리턴하는 메소드
	 * 매개변수 : 두 정수와 연산자
	 * 리턴타입 : double
	 * 
	 * 예외 발생시키기 : throw new
	 */
	
	public double calc(int num1, int num2, char op) throws RuntimeException{
		double result = 0;
		
		
		if((op=='/'&&num2==0)) {
			throw new RuntimeException("0으로 나눌 수 없습니다.");
		}
		
		switch (op) {
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1-num2;
			break;
		case '*':
			result = num1*num2;
			break;
		case '/':
			result = num1/num2;
			break;
		case '%':
			result = num1%num2;
			break;

		default:
//			System.out.println("산술연산자가 아닙니다.");
			throw new RuntimeException("산술연산자가 아닙니다.");
		}
		return result;
	}
	

}
