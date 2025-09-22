package day05;

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 그림 파일만 출력
		
		
		String[] fileName = {
				"이것이 자바다.java", "java의 정석.java", "Array.txt", "array.java", "String.png", "StringMethod.jpg",
				"ArrayMethod.java", "method.png", "javaMethod.jpg", "PNG.java"
		};
		
		for(String s: fileName) {
			String temp = s.substring((s.lastIndexOf('.')+1));
			if(temp.toLowerCase().equals("jpg")||temp.toLowerCase().equals("png")) {
				System.out.println(s);
			};
		}

	}

}
