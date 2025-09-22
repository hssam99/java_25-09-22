package java_project;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num1=10, num2=20, num3=30;
		int num;
		// int num; 중복 선언 불가
		num = 0;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num);
		System.out.println();
		
		// char = 아스키 코드 표에 따른 한글자만 저장이 가능하다
		char a = 'a';
		
		System.out.println((int)(a));
		System.out.println(a);
		
		
		char ch = '가';
		System.out.println(ch);
		System.out.println((int)ch);
		
		
		double dou = 3.1;
		System.out.println(dou);
		
		
		boolean boo = true;
		System.out.println(boo);
		
		
		float f = 1.2f;
		System.out.println(f);
		
		
		long l = 1L;
		System.out.println(l);
		
		num1 = 020; // 8진법으로 인식
		System.out.println(num1); //16
		
		num2 = 0x10; // 16진법으로 인식
		System.out.println(num2); //16
		
		
		{
			int c = 100;
			System.out.println(c);
		}
		
		// instanceof
		
		
		System.out.println("문자를 숫자로 바꿔서 인식하는 메소드");
		
		
		String str = "1234";
		int strNum = Integer.parseInt(str); //문자를 숫자로 읽어오게 하는 메소드
		System.out.println(str+1); // 12341
		System.out.println(strNum+1); // 1235
		
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
