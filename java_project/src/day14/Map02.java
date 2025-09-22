package day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {

		Map<String, Integer> grade = new HashMap<>();
		int input = -1;
		int sum = 0, cnt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("start...");

		// try ~ catch 사용해서 1, 0 중 숫자 아닌 문자 입력되면 오류

		while (input != 0) {
			System.out.println("1. continue 0. exit");
			System.out.print(">>");
			try {
				input = sc.nextInt();

				if (input == 0) {
					System.out.println("프로그램을 종료합니다.");
					break;
				} else if (input != 1) {
					System.out.println("잘못된 숫자를 입력했습니다.");
					continue;
				} else {
					System.out.println("과목과 점수를 입력하세요");
					System.out.print("과목>>");
					String sub = sc.next();
					System.out.print("점수>>");
					int score = sc.nextInt();
					sum+=score;
					cnt++;
					grade.put(sub, score);
				}

			} catch (Exception e) {
				System.err.println("입력값이 잘못되었습니다.");
//				input = sc.nextInt(); // k 엔터가 남아있는데 이거가 int 변수인 input이랑 다른 자료형이므로 에러!
//				String tmp = sc.nextLine(); // 입력 버퍼 소거
//				System.out.println(tmp); // 보통 catch에서 어떠한 기능을 수행하지 않음.
				sc.nextLine(); // 입력 버퍼 소거
			}
		}

		System.out.println(grade);
		System.out.println("합계:"+sum);
		System.out.println("평균:"+sum/cnt);
		

	}

}
