package day02;

public class For01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		/*
		 * for, while, do~while
		 * 
		 * 
		 */
		
		
		for(int i = 0;i<100;i++) {
			
			
		}
		
		
		for(int i=0; i<10;i++) {
			System.out.println(i);
			i++;
		}
		
		
		
		System.out.println();
		
		
		
		for(int i = 0; i<10;i++) {
			System.out.println(i+1);
		}
		
		
		System.out.println();
		
	
		int sum=0;
		
		for(int i =0; i<10;i++) {
			sum+=(i+1);
		}
		
		System.out.println(sum);
		
		
		System.out.println();
		
		
		//1부터 10까지 짝수합 
		
		int sum2 = 0;
		
		for(int i = 1; i<=10;i++) {
			sum2 = i%2==0?sum2+i:sum2;
		}
		
		System.out.println(sum2);
		
		
		//1부터 10까지 홀수합
		
		
		int sum3 = 0;
		
		for(int i = 1; i<=10;i++) {
			sum3 = i%2==1?sum3+i:sum3;
		}
		
		System.out.println(sum3);
		
		
		
		
	}

}
