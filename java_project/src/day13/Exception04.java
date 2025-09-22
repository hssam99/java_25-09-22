package day13;

public class Exception04 {

	public static void main(String[] args) {
		
//		
//		int arr2[] = new int[3];
//		System.out.println(arr2[5]);
		
		
		
		try {
//			int arr[] = new int[3];
//			System.out.println(arr[5]);
			System.out.println(4/0);
			
		}catch (ArithmeticException e) {
			System.out.println("0으로 나누었습니다.");
		}catch(NullPointerException e) {
			System.out.println("객체가 null입니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위가 넘어갔습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("종료");
		
		
		
		
	}

}
