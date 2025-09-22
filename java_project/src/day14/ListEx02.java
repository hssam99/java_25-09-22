package day14;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx02 {

	public static void main(String[] args) {
		/*
		 * 숫자를 입력받아서 입력받은 숫자로 list 생성
		 * 출력 => 전체 합계 출력
		 * 
		 * 
		 * ex) 입력 > 45,78,98,,68,51,23,56,94,75,65 enter
		 * split "," => String[]
		 * 숫자로 변환하여 => ArrayList<Integer>
		 * 합계 출력 
		 */
		
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
//		String input = sc.next(); // 입력
		String input = "45,78,98,68,51,23,56,94,75,65" ;// 입력
		String[] num = input.split(","); // 배열로 밖에 리턴을 하지 않으므로 리스트로 리턴 불가
		int sum = 0;
		
		for(String s : num) {
			int tmp = Integer.parseInt(s);
			list.add(tmp);
			sum+=tmp;
		}
		
		System.out.println(list);

	}
	
	

}
