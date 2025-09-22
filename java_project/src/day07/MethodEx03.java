package day07;

import java.util.Arrays;

public class MethodEx03 {
	// 유저 로또 랜덤 수 설정 (+ 중복 확인)
	public int[] makeRandomNum(int[] arr) {
		arr[0] = (int) ((Math.random() * 45) + 1); // arr[0] 1~45
		for (int i = 1; i < arr.length; i++) {
			int tmp = (int) ((Math.random() * 45) + 1); // 1~45
			boolean chk = checkDuplication(arr,tmp); // 중복값 체크

			// chk true > 중복값 있으면 tmp 다시
			if (chk) {
				i--;
			}else {
				arr[i] = tmp;
			}
		}
		return arr;
	}

	// 중복값 확인
	// true > 중복값 있음 false >> 중복값 없음
	public boolean checkDuplication(int[] arr, int tmp) {

		boolean chk = false;
		
		for(int i : arr) {
			if(i==tmp) {
				chk = true;
			}
		}
		return chk;
	}

	
	
	// 등수 추출
	public void checkWinner(int[] user, int[] lotto) {
		int cnt = 0;
		int bonus = lotto[6];
		boolean chk = false;
		
		
		//유저 배열과 로또 번호(6자리) 비교
		for(int i=0;i<lotto.length-1;i++) {
			if(checkDuplication(user,lotto[i])) {
				cnt++; // 같은 값이 있으면 증가
			}
		}

		
		// bonus 일치 검사
		for(int i : user) {
			if(i==bonus) {
				chk = true;
			}
		}
		
		
		switch (cnt) {
		case 6:
			System.out.println("win!!!!!!!!!");
			break;
		case 5:
			if(chk==true) {
				System.out.println("2등!");
			}else {
				System.out.println("3등!");
			}
			break;
		case 4:
			System.out.println("4등!");
			break;
		case 3:
			System.out.println("5등!");
			break;

		default:
			System.out.println("꽝!");
			break;
		}
		
		
	}

	// 배열 출력 메소드
	public void printLotto(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == 6) {
				System.out.print("[" + arr[i] + "]");
				break;
			}
			System.out.print(arr[i] + " ");

		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 당첨 확인 메소드
		/* 로또 번호 생성
		 * user 번호 6개
		 * 1~45까지 중 6개 번호를 랜덤 생성 (자동)
		 * 당첨 번호 7개 (보너스번호+1)
		 * 
		 * 당첨번호와 유저 번호를 비교하여 등수 추출
		 * 6개 일치 : 1등  (보너스제외)
		 * 5개 일치 + 보너스 : 2등
		 * 5개 일치 : 3등
		 * 4개 일치 : 4등
		 * 3개 일치 : 5등
		 * 나머지 꽝!
		 * */
		
		
		MethodEx03 mx3 = new MethodEx03();

		int[] user = new int[6];
		int[] lotto = new int[7];
		
		mx3.makeRandomNum(user);
		mx3.makeRandomNum(lotto);

		mx3.printLotto(user);
		mx3.printLotto(lotto);
		
		mx3.checkWinner(user, lotto);

	}

}
