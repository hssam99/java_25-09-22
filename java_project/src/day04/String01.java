package day04;

public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * String class: 문자열을 다루기 위한 클래스 > 기본 자료형 X
		 * class : 여러가지 기능을 담고 있는 정의서
		 * 클래스 타입 객체명 = new 클래스명(생성자);
		 * 
		 * String str = new String();
		 * 
		 * String은 너무 자주 사용되기 때문에 일반 자료형처럼 사용이 가능하다. 
		 * 
		 */
		
		
		
		String str = "abc";
		String str1 = "abcdefghi";
		System.out.println(str);
		
		
		// class 이기 때문에 여러가지 관련 메소드들이 존재한다
		System.out.println("length");
		System.out.println(str.length()); // 3
		
		System.out.println("charAt");
		System.out.println(str.charAt(2)); // c
		
		
		System.out.println("substring");		
		System.out.println(str1.substring(4)); // 4번부터 끝까지 출력
		System.out.println(str1.substring(0,3)); // 처음부터 3까지 출력
		
		
		System.out.println("equals");
		System.out.println(str1.equals("abcdef"));
		System.out.println(str1.equals("abcdefghi"));
		
		
		System.out.println("indexof");
		System.out.println(str1.indexOf("ab",3));
		System.out.println(str1.indexOf("c"));
		

		
		
		String email = "sumin5400@gmail.com";
		//int idx_emal = email.indexOf("@");
		System.out.println(email.substring(0, email.indexOf("@")));
		
		
		
		// compareTo
		
		
		
		// contains
		System.out.println("contains");
		String str2 = "hellojava.html";
		System.out.println(str2.contains("java"));
		
		
		// concat 이어붙이기
		
		
		
		

	}

}
