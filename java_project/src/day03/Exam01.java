package day03;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 소수, 약수가 1 과 본인으로 이루어져 있는 숫자
		// 1~100까지 소수만 출력
		int num = 1;
		int cnt=0;
		int prime_cnt = 0; // 소수 개수 
		
		
		while(num<=100) {
			cnt = 0;
			// num을 1~num까지 나눔
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
				cnt++;
				}
			}
			
			if(cnt==2) {
				System.out.println(num);
				prime_cnt++;
			}
			
			num++;
		}
		
		
		System.out.println("1부터 100까지의 소수의 개수:"+prime_cnt);
		
		
	}

}
