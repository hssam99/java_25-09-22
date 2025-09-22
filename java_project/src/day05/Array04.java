package day05;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		


		for(int i =0;i<arr.length;i++) {
			System.out.print("arr["+i+"] >>");
			arr[i] = sc.nextInt();
		}
		
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
