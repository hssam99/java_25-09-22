package day13;

public class Exception01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Error: 복구할 수 없는 심각한 오류
		 * Checked Exception: 컴파일 시점에서 예외처리가 일어나는 예외
		 * => IOException / SQLExeption
		 * UnChecked Exception : 컴파일 시점에서 예외처리가 강제되지 않아 런타임에 발생하는 예외 
		 * 주로 개발자의 프로그래밍 실수로 인해 발행하는 케이스
		 * 
		 * 
		 * 오류의 종류
		 * - 논리적 오류: 실행은 되지만 의도와는 다르게 동작하는 오류
		 * - 컴파일 오류: 컴파일 시 발생하는 에러 (문법 구문 오류 : syntx error)
		 * - 런타임 오류: 실행 시 잘못된 결과를 얻거나, 외부적인 요인에 의해 비정상 종료되는 경우
		 * 
		 * 
		 * 실행시(runtime) 발생할 수 있는 오류들
		 * - 문제가 발생할 때는 대비하여 이에 대한 대응코드를 미리 작성함 => 예외 처리
		 * - 예외 처리를 통해 비정상 종료를 막을 수 있음.
		 * - 예외가 발생되면 예외발생 시점부터 코드는 중지 => 예외 문구 출력
		 * - 예외처리 => 예외가 발생하는 코드 이후 시점부터 중지
		 * 				처리구문 이후 부터는 정상처리로 유지시키는 기능
		 * 
		 * try ~ catch
		 * try ~ catch ~ finally
		 * 
		 * 
		 * - try : 예왹 발생할 가능성이 있는 구문을 작성
		 * - catch : try 구문에서 발생한 예외를 처리
		 * - finally : try 구문 외 반드시 실행되어야 하는 문구를 작성 (생략가능) 
		 * 
		 */
		
		try {
			System.out.println(1+0);
			System.out.println(1/0);
			System.out.println(1*0);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage()); //   / by zero > 오류가 난 부분 출력
//			System.out.println("0으로 나누었습니다. 오류~!!");
		}
		
		// exceptiond이 발생해도 실행되는 구역
		System.out.println(1+1);
		System.out.println(1+2);
		System.out.println(1+3);
		
		
		
		
		

	}

}
