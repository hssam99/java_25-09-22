package day05;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//대소문자 구문없이 검색어 출력
		
		String[] fileName = {
				"이것이 자바다.java", "java의 정석.java", "Array.txt", "array.java", "String.png", "StringMethod.jpg",
				"ArrayMethod.java", "method.png", "javaMethod.jpg"
		};
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("search>>");
		String user = sc.next();
		int cnt=0;
		
		
		for(String s : fileName) {
			if(s.toLowerCase().contains(user.toLowerCase())) {
				System.out.println(s);
				cnt++;
			}
		}
		
		if(cnt==0) {
			System.out.println("검색 결과가 없습니다.");
		}
		
	}

}
