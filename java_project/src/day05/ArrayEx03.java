package day05;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int [10];
		
		for(int i=0; i<10; i++) {
			arr[i] = i+1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		int index = (int)(Math.random()*10);
		
//		int temp = arr[i];
//		arr[i] = arr[index];
		
		
//		for(int i = 0; i<arr.length; i++) {
//			int index = (int)(Math.random()*arr.length);
//			
//		}
		

	}

}
