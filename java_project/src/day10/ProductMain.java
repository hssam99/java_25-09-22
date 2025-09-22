package day10;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Order[] cus1 = new Order[100]; // 고객당 100개 주문 가능
		Product[] menu = new Product[7];
		
		menu[0] = new Product("soccer ball", 12000);
		menu[1] = new Product("computer", 2000000);
		menu[2] = new Product("nintendo", 800000);
		menu[3] = new Product("redbull", 2000);
		menu[4] = new Product("speaker", 600000);
		menu[5] = new Product("glasses", 150000);
		menu[6] = new Product("muffins", 14000);
		int cnt =0;
		int num = 1;
		
		System.out.println("-------------menu-------------");
		System.out.println("1. soccer ball\t\t12000");
		System.out.println("2. computer\t\t2000000");
		System.out.println("3. nintendo\t\t800000");
		System.out.println("4. redbull\t\t2000");
		System.out.println("5. speaker\t\t600000");
		System.out.println("6. glasses\t\t150000");
		System.out.println("7. muffins\t\t14000");
		System.out.println("0. 주문 종료");
		

		while(num!=0){
			System.out.print(">>your order: ");
			num = sc.nextInt();
			if(num==0) {
				System.out.println("주문을 종료합니다.");
				break;
			}else if(cnt>100) {
				System.out.println("더 이상 담을 수 없습니다.");
			}else {
				System.out.print(">>quantity: ");
				int qty = sc.nextInt();
				Order o = new Order(menu[num-1].getName(), menu[num-1].getPrice(), qty);
				cus1[cnt]=o;
				cnt++;
			}
			
		}
		
		System.out.println("-------------주문 내역-------------");
		int sum = 0;
		for(int i = 0; i<cnt;i++){
			cus1[i].printOrder();
			sum += cus1[i].getSum();
		}
		
		System.out.println("[총 주문금액: "+sum+"]");
	}

}
