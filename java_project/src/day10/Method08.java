package day10;

public class Method08 {
	
	public int sum (int ...num) {
		int result = 0;
		for(int tmp:num) {
			result +=tmp;
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
