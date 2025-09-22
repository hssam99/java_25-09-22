package day08;

import java.util.Arrays;

public class CardPack {
	
	
	private Card[] pack = new Card[52]; // 생성자 배열
	String[] shape = {"♣", "♦", "♥", "♠"};
	private int cnt=0;
	
	public CardPack() {
		
	}
	
	
	
	// 카드 섞기
	public void mixPack() {
		
		for(int i = 0; i<pack.length;i++) {
			int tmpNum = (int)(Math.random()*pack.length);
			
			Card tmp = pack[i];
			pack[i] = pack[tmpNum];
			pack[tmpNum] = tmp;
			
		}
		
	}
	
	
	// 카드 뽑기
	
	public Card pick() {
		int rdNum = (int)Math.random()*pack.length; // 주소
				
		return pack[rdNum];
	}
	
	
	
//	// 카드섞기
//	public void mixPack2() {
//		
//		/*
//		 * 
//		 * 1. while문 52번 반복
//		 * 2. 숫자 랜덤 지정 > 하트 7
//		 * 3. 해당 숫자가 랜덤으로 갈 곳 지정 > 다이아몬드 9
//		 * 4. 다이야몬드 9를 2번으로 넣어서 반복
//		 * 
//		 */
//		
//		// 이미 사용한 주소를 저장할 정수 배열 생성
//		int[] tmpArr = new int[52];
//		int tmpNum = (int)Math.random()*51; // 하트7
//		int count = 0;
//	
//		while(count>52) {
//			while(true) {
//				int tmp = (int)Math.random()*pack.length; // 다이아몬드 9
//				boolean tf = noDup(tmpArr, tmp); // 다이아몬드 9가 이미 바꿨던 주소인지 아닌지 검사
//				// 처음 바꾸는 거일경우
//				if(!tf) {
//					tmpArr[cnt] = tmp; // tmpArr에 다이아몬드9 등록 (이미 한 번 변경된 값이라는 것 기록) 
//					Card tmpC = pack[tmp]; // tmpc = 다이아몬드 9
//					pack[tmp] = pack[tmpNum]; // 다이아몬드 9 자리에 하트 7 넣음
//					tmpNum=tmp; // 하트 7 값이 다이아몬드 9가 됨 
//					count++;
//					break;
//				}
//			}
//
//		}
//	}
//	
//	// 중복 검사 메소드
//	
//	public boolean noDup(int[] arr, int tmp) {
//		boolean chk = false;
//		for(int i : arr) {
//			if(i==tmp) {
//				chk = true;
//			}
//		}
//		return chk;
//	}
	
	
	
	
	// 카드 52개 만들기
	public void makePack() {
		for(String s : shape) {
			for(int i = 1; i<=13;i++) {
				Card c = new Card();
				c.setNum(i);
				c.setShape(s);
				pack[cnt] = c;
				cnt++;
			}
		}
	}
	
	
	// 카드 52개 출력 (13개씩 4줄)
	public void printPack() {
		int cnt = 0;
		for(Card c : pack) {
			c.printCard();
			cnt++;
			if(cnt%13==0) {
				System.out.println();
			}
		}
	}
	
	
	
	// getter setter
	
	public Card[] getPack() {
		return pack;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}





	@Override
	public String toString() {
		return "CardPack [pack=" + Arrays.toString(pack) + ", cnt=" + cnt + "]";
	}
	
	
	// 
	
	

	
	
	

}
