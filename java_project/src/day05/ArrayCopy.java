package day05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 배열의 크기는 증가,감소가 불가함
		 * copy를 통해 재구성
		 * System.arraycopy(이전배열, 시작번지, 새배열, 시작번지, 개수);
		 * 
		 */
		
		
		int[] arr = new int[5];
		arr[0] = 15;
		arr[1] = 22;
		arr[2] = 35;
		arr[3] = 13;
		arr[4] = 93;

		int[] arr2 = new int[10];
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		System.out.println(Arrays.toString(arr));
		
		arr = arr2; // arr에 arr2 주소로 초기화, 기존 값도 초기화
		System.out.println(Arrays.toString(arr));
		
	}

}
