package day14;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		
		
		Set<Integer> lotto = new HashSet<>();
		
//		for(int i=0 ; i<6; i++) {
//			int radNum = (int)(Math.random()*45)+1; // 1~45 랜덤번호 생성
//			if(lotto.add(radNum)==false) {
//				i--; //중복값 있으면 다시 배치
//			}
//			lotto.add(radNum);
//		}
		
		
		while(lotto.size()<6) {
			int radNum = (int)(Math.random()*45)+1; // 1~45 랜덤번호 생성
			lotto.add(radNum);
		}
		System.out.println(lotto);
		
		System.out.println("---------------");
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		
		while(treeSet.size()<6) {
			int radNum = (int)(Math.random()*45)+1; // 1~45 랜덤번호 생성
			treeSet.add(radNum);
		}
		System.out.println(treeSet);
		
		// 가장 앞에 있는값, 뒤에 있는값
		System.out.println("first/last");
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		
		// 기준값의 앞쪽, 뒷쪽
		System.out.println("headset/tailset");
		System.out.println(treeSet.headSet(20));
		System.out.println(treeSet.tailSet(20));
		
		//값 사이
		System.out.println("subSet");
		System.out.println(treeSet.subSet(10,20));
		
		

	}

}
