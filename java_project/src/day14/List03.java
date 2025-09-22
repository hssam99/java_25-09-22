package day14;

import java.util.ArrayList;
import java.util.Iterator;

public class List03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 과일 5개 정도 저장하고 list 출력
		 */
		
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		list.add("tangerine");
		list.add("pear");
		list.add("grape");
		list.add("watermelon");
		
		System.out.println(list);
		
		
		System.out.println("---- 일반 for ----");
		// 일반 for 출력
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("---- 향상 for ----");
		// 향상된 for 출력
		for(String s : list){
			System.out.println(s);
		}
		
		System.out.println("---- iterator ----");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp);
		}
		
		
		
		
		
		
		

	}

}
