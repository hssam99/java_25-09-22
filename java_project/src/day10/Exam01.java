package day10;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		Product[] menu = new Product[10];
		
		
		
		
		// 상품 등록(y/n)
		
		char c = 'y';
		int cnt = 0;
		
		while(c!='n') {
			System.out.println("상품등록(y/n) >");
			c = sc.next().charAt(0);
			
			if(c=='y') {
				System.out.print("상품명 >");
				String name = sc.next();
				System.out.print("가격 >");
				int price = sc.nextInt();
				
				// 객체 생성 
				Product p = new Product(name, price);
				menu[cnt] = p;
				cnt++;
				
				
			}else {
				if(c=='n') {
					System.out.println("상품등록을 종료합니다.");
					break;
				}else {
					System.out.println("y/n만 가능합니다.");
				}
			}
		}
		
		
//		System.out.println("상품명과 가격을 입력하세요");
//		String name = sc.next();
//		int price = sc.nextInt();
//		
//		
//		menu[0].add(name, price);
//		
		

	}

}


