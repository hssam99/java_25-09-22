package day03;

public class For06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 15;
		
		int min = 0;

		for (int i = num1;; i = i + num1) {
			if (i % num1 == 0 && i % num2 == 0) {
				min = i;
				break;
			}

		}
		
		System.out.println(min);
		
		
		
	}

}
