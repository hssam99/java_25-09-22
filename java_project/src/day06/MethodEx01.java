package day06;

import java.util.Scanner;

public class MethodEx01 {

	public void print(int num1, int num2, int result, String op) {
		if (result == -9999999) {
			System.out.println("error! 0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println(num1 + op + num2 + "=" + result);
	}

	// method overloading
	public void print(int num1, int num2, double result, String op) {
		if (result == -9999999) {
			System.out.println("error! 0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println(num1 + op + num2 + "=" + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method03 m3 = new Method03();
		MethodEx01 mx1 = new MethodEx01();
		Scanner sc = new Scanner(System.in);

		System.out.println("--menu--");
		System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 나눗셈 | 5. 나머지 | 6. 종료");

		int input = 0;

		do {
			System.out.print("메뉴 선택 >>");
			input = sc.nextInt();

			// 1~6외 숫자를 입력했을 경우
			if (input > 6 || input <= 0) {
				System.out.println("error! 다시 입력하세요!");
				continue;
			}

			// 6번: 프로그램 종료
			if (input == 6) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}

			// 1~5
			System.out.print("숫자 입력(두 정수)>");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			// 메뉴 선택
			switch (input) {

			case 1:
				mx1.print(num1, num2, num1 + num2, "+");
				// System.out.println(num1 + "+" + num2 + "=" + m3.sum(num1, num2));
				break;
			case 2:
				mx1.print(num1, num2, num1 - num2, "-");
				// System.out.println(num1 + "-" + num2 + "=" + m3.sub(num1, num2));
				break;
			case 3:
				mx1.print(num1, num2, num1 * num2, "*");
				// System.out.println(num1 + "*" + num2 + "=" + m3.mul(num1, num2));
				break;
			case 4:
				double div = m3.div(num1, num2);
				mx1.print(num1, num2, div, "/");
				// System.out.println(num1 + "/" + num2 + "=" + m3.div(num1, num2));
				break;
			case 5:
				int mod = m3.mod(num1, num2);
				mx1.print(num1, num2, mod, "%");
				break;

			default:
				return;
			}

		} while (true);

	}

}
