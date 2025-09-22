package day15;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		
		SaleController con = new SaleController();
		Scanner sc = new Scanner(System.in);
		
		con.makeProductList();
		int input = -1;
		
		/*
		 * 1. 메뉴추가
		 * 2. 메뉴보기
		 * 3. 주문하기
		 * 4. 주문출력하기
		 * 0. 종료
		 */
		
		
		do {
			try {
				con.printOption();
				System.out.print(">>");
				input = sc.nextInt();
				switch (input) {
				case 1: con.addMenu(sc); break;
				case 2: con.printMenu(); break;
				case 3: con.order(sc); break;
				case 4: con.printOrder(); break;
				case 0: System.out.println("종료합니다."); return;
				default:
					System.out.println("잘못된 번호입니다.");
					System.out.println("...");
					break;
				}
			} catch (Exception e) {
				System.err.println("잘못된 값을 입력했습니다.");
				input = -1;
				sc.nextLine();
			}
		}while(input!=0);
		

	}



}
