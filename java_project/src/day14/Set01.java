package day14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		
		
		
		/*
		 * Set : index가 없음 (순서보장 X, 중복불가능)
		 * 정렬은 list만 가능
		 * HashSet(대표적인 Set 구현 클래스) / TreeSet(정렬)
		 * 
		 */
		
		Set<String> set = new HashSet<String>();
		
		set.add("apple");
		set.add("pear");
		set.add("tangerine");
		set.add("grape");
		set.add("peach");
		
		System.out.println(set);
		set.add("pear");
		System.out.println(set);
		
		
		for(String tmp : set) {
			System.out.println(tmp);
		}
		
		
		System.out.println("---iterator 출력---");
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String t = it.next();
			System.out.println(t);
		}
		
		
	}

}
