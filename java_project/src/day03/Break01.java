package day03;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i =1;i<=10;i++) {
			if(i%2==1) {
				continue;
			}
			System.out.println(i);
		}

		
		Scanner sc = new Scanner(System.in);
		
		char ch='a';
		
		
		while(ch!='y') {
			ch = sc.next().charAt(0);
			System.out.print(ch);
		}
		
		
	}

}




// 한글자를 입력받아 그 한글자를 출력
// char scan.next().charAt(0)
//'y'면 종료


