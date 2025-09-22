package day07;

public class Method05 {

	// 최대 공약수
	public int gcd(int num1, int num2) {

		int max = 0;
		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				max = i;
			}
		}
		return max;
	}

	// 최소 공배수
	public int lcm(int num1, int num2) {

		int min = 0;
		for (int i = num1;; i = i + num1) {
			if (i % num1 == 0 && i % num2 == 0) {
				min = i;
				return min;
				//break;
			}
		}
		//return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method05 m5 = new Method05();
		
		System.out.println(m5.gcd(100, 28));
		System.out.println(m5.lcm(3, 5));

	}

}
