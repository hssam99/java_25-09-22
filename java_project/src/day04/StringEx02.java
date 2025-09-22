package day04;

public class StringEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String file = "자바의 정석.java";
//		String file = "fileName.suffix";
//		
//
//		int f = file.indexOf("."); // .의 위치
//		
//		
//		String suffix = file.substring(f+1);
//		String fileName = file.substring(0,f);
//		
////		System.out.println(file.substring(f+1)); // 확장자명 출력
////		System.out.println(file.substring(0,f)); // 파일 출력
//		
//		
//		if(suffix.equals("java")) {
//			System.out.println(fileName+"은 자바 파일입니다.");
//		}else {
//			System.out.println(fileName+"은 기타 파일입니다.");
//		}
//		
		
		
		
		
		String[] fileArr = file.split("\\.");
		
		for (String f : fileArr) {
			System.out.println(f);
		}
		
		if(fileArr[1].equals("java")){
			
			
			
			}
		}

}
