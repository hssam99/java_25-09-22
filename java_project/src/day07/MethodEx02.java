package day07;

import java.util.Arrays;

public class MethodEx02 {

	// 배열 출력
	public void printArr(int[] arr) {
		String arrStr = Arrays.toString(arr);
		System.out.println(arrStr);

	}

	// 배열 정렬
	public void sortArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// 앞에 있는 숫자(arr[i])가 뒤에 있는 숫자(arr[j])보다 클 경우 교체
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	// 합계 메소드
	public int sum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

	// 평균 메소드
	public double avg(int[] arr) {
		double avg = 0;
		avg = (double) sum(arr) / arr.length;
		return avg;
	}

	// 최대 메소드
	public int max(int[] arr) {
		int max = arr[0];		
		for(int i : arr) {
			max = Math.max(max, i);
		}
		return max;
	}

	// 최소 메소드
	public int min(int[] arr) {
		int min = arr[0];
		for(int i : arr) {
			min = Math.min(min, i);
		}
		return min;
	}

	// 배열 합계, 평균, 최대, 최소 출력
	public void printArrInfo(int[] arr) {
		System.out.println("합계: " + sum(arr));
		System.out.println("평균: " + avg(arr));
		System.out.println("최대값: " + max(arr));
		System.out.println("최솟값: " + min(arr));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 메소드 생성
		// 1. 배열을 받아 배열을 출력하는 메소드
		// 2. 배열을 받아 해당 배열을 오름차순으로 정렬하는 메소드
		// 3. 배열을 받아 배열의 합계와, 평균, 최대, 최소를 출력하는 메소드

		MethodEx02 mx2 = new MethodEx02();
		Method06 m6 = new Method06();
		int[] arr = m6.rdArr(); // 배열 생성

		mx2.printArr(arr);
		System.out.println("---sorted---");
		mx2.sortArr(arr);
		mx2.printArr(arr);
		mx2.printArrInfo(arr);

	}

}
