package day13;

public class Exception06 {

	public static void main(String[] args) {

		try {
			for (int i : makeArr(0, 1, 5)) {
				System.out.println(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int i : makeArr(3, 1, 5)) {
			System.out.println(i);
		}

	}

	/*
	 * size를 입력받아 size의 길이를 가지는 배열을 생성
	 * 랜덤값을 채워 배열을 리턴하는 메소드
	 * 랜덤값의 범위는 start(시작), count(개수)
	 * - size가 0보다 작으면 예외발생
	 * - count가 0보다 작으면 예외발생
	 * 리턴타입 : 배열 => int[]
	 * 매개변수: int size, int start, int count
	 */

	// runtime exception만 메소드에 throws 안해도 작동. 나머지 exception은 반드시 명시해주어야 한다.
	public static int[] makeArr(int size, int start, int count) throws RuntimeException {

		if (size <= 0) {
			throw new RuntimeException("배열의 길이가 0보다 작습니다.");
		}
		if (count <= 0) {
			throw new RuntimeException("랜덤의 범위가 0보다 작습니다.");
		}

		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * count) + start;
		}

		return arr;
	}

}
