package day04;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열은 참조 변수
		/*
		 * 배열 선언 방법
		 * 
		 * 타입[] 배열명;
		 * int[]
		 * String[]
		 * double[]
		 * 
		 * 배열안의 변수값은 초기화가 자동으로 이루어진다.
		 * int[] arr = new int [10]; // 10개 짜리 배열
		 * int[] arr = new int[]{1,2,3,4,5,}
		 * int[] arr = {1,2,3,4,5}
		 * 
		 * 
		 * 배열의 길이는 0 이상이어야 한다.
		 * 
		 * 
		 */
		
		
		int [] arr1;
		int[] arr = new int[5];
		int[] arr2 = new int[] {1,2,3,4,5};
		int[] arr3 = {10,20,30,40,50};
		
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
		System.out.println(arr3[4]);
		System.out.println("--------------------");
		
		// arr에 값 추가
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("--------------------");
		
		int[] arr5 = new int[10];
		for(int i = 0; i<arr5.length;i++) {
			arr5[i] = i+1; // 배열 arr5에 1~10까지 대입
		}
		
		
		for(int a : arr5) {
			System.out.println(a);
		}
		
		
		
		
		int[] arr6 = new int[5];
		
		
		
		
		
		
		

	}

}
