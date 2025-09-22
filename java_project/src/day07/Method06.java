package day07;

import java.util.Arrays;

public class Method06 {

	// 0~100 정수 5개를 담는 배열을 생성하여 리턴하는 메소드
	public int[] rdArr() {
		int[] rdArr = new int[5];
		for (int i = 0; i < rdArr.length; i++) {
			rdArr[i] = (int) (Math.random() * 100); // 0~100 랜덤 생성
		}
		return rdArr;
	}

	// 평균 구하기
	public double arrAvg(int[] arr) {
		double avg = 0;
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		avg = (double) sum / arr.length;
		return avg;
	}

	// 배열 평균 출력 메소드
	public void printArr(int[] arr) {
		String arrStr = Arrays.toString(arr);
		System.out.println("배열: " + arrStr);
		System.out.println("평균: " + arrAvg(arr));

	}

	// overloading
	public void printArr() {
		int[] arr = rdArr();
		String arrStr = Arrays.toString(arr);
		System.out.println("배열: " + arrStr);
		System.out.println("평균: " + arrAvg(arr));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method06 m6 = new Method06();
		int[] arr = m6.rdArr(); // 배열 생성
		m6.printArr(arr); // 출력
		m6.printArr(); // 출력

	}

}
