package day05;

import java.util.Arrays;
import java.util.Collections;

public class ArrayEx04 {
	public static void main(String[] args) {
		
		//1~100까지 랜덤수 설정
//		int[] arr = new int[10]; //오름차순만
		Integer[] arr = new Integer[10]; //오름차순만
		
		for(int i=0;i<10;i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		int tmp=0;

		// 오름차순 (logic)
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					tmp=arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		// 오름차순 sort
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		// 내림차순 sort
		Arrays.sort(arr, Collections.reverseOrder()); // Integer만
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	
	
	

}
