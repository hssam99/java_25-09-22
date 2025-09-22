package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class List02 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i<10;i++) {
			list.add(i+1);
		}
		
		System.out.println(list);
		
		for(int i : list) {
			System.out.println(i);
		}
		
		
		System.out.println("---------------");
		System.out.println("iterator 출력");
		
		// set, map은 index가 없음 => 일반 for문은 사용불가.
		// 순서와 상관없이 
		
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int tmp = it.next();
			System.out.println(tmp);
		}
		
		// 해당 값의 번지를 리턴 / 없으면 -1
		System.out.println(list.indexOf(10));
	
		list.clear();
		list.add(45);
		list.add(12);
		list.add(78);
		list.add(65);
		list.add(86);
		list.add(20);
		System.out.println(list);
		
		Collections.sort(list); // 오름차순만 가능.
		System.out.println(list);

	}

}
