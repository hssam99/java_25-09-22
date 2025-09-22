package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		//Map : 값을 쌍으로 저장 key / value
		// - key는 중복 불가능, value: 중복가능
		// - HashMap을 가장 많이 사용
		
		
		Map<String, Integer> map = new HashMap<>();
		
		
		map.put("apple", 2000);
		map.put("banana", 2500);
		map.put("orange", 3000);
		map.put("apple", 2500);
		map.put("peach", 3000);
		map.put("kiwi", 4000);
		System.out.println(map);
		
		
		// list.get(i) / map.get(key) => value 리턴
		System.out.println(map.get("banana"));
		
		System.out.println("---test---");
		//keySet() : 키만 set으로 리턴
		//values() : value만 출력
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet()); // 전체
		
		int sum =0;
		System.out.println("---for---");
		for(String s : map.keySet()) {
			int value = map.get(s);
			System.out.println(s+":"+map.get(s)); // s==key, get(s)==value
			sum +=value;
		}
		System.out.println(sum);
		
		System.out.println("---iterator---");
		// iterator
		Iterator<String> it =map.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			System.out.println(key+":"+map.get(key));
		}
		
		System.out.println("---remove---");
		
		System.out.println(map.remove("apple")); // value remove
		System.out.println(map.remove("banana", 2500));
		System.out.println(map);
		
		
		
	}

}
