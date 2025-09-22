package day92;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * Math.random() : 0~1 random number
		 * Math.round() : 반올림 소수 자리수는 0
		 * Math.ceil(): 올림 소수 자리수는 0
		 * Math.floor(): 버림 소수 자리수는 0
		 * 
		 */

		
		double num = 3.64159;
		long roundNum = Math.round(num);
		System.out.println(roundNum);
		
		int ceilNum = (int)Math.ceil(num);
		System.out.println(ceilNum);
		
		int floorNum = (int)Math.floor(num);
		System.out.println(floorNum);
		
		System.out.println();
		
		// Max, Min
		
		System.out.println(Math.max(10, 20));
		System.out.println(Math.min(10, 20));
		
		
		System.out.println();
		
		
		// random
		
		System.out.println(Math.random()); //0~1사이 아무값 리턴
		System.out.println(Math.random()*10); // 0~10
		System.out.println((int)(Math.random()*10)); //0~9
		System.out.println((int)(Math.random()*10)+1); //1~10
		
		
		// 주사위값 랜덤으로 출력
		
		System.out.println((int)Math.random()*6+1);
		
		
		
		
	}

}
