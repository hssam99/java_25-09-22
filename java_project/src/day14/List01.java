package day14;

import java.util.ArrayList;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		// List => ArrayList
		List<Integer> list = new ArrayList<>();
		
		// add() : 요소를 추가
		list.add(1); // autoboxing int => integer
		list.add(2);
		list.add(3);
		System.out.println(list); // 자체 toString() 호출
		
		// get(index) : index 번지의 값을 가져오기
		// arr[0] 와 같은 의미
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		
		// set(index, value)
		
		list.set(0, 10);
		System.out.println(list);
		
		System.out.println("--for문으로 list 출력--");
		int sum = 0;
		
		for(int i : list) {
			System.out.println(i);
			sum+= i; // auto unboxing
		}
		
		System.out.println(sum);
//		
//		for(int i = 0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		// remove(index) : index 번지의 값을 삭제
		// remove(object) : object 값을 삭제
		
		System.out.println(list.remove(0)); // 0번지 삭제
		
		System.out.println(list);
		
		Integer r = 3;
		list.remove(r); 
		System.out.println(list.remove(r)); // boolean
		
		System.out.println(list);
		
		
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		for(int i = 0; i<10;i++) {
			list1.add(i+1);
		}
		
		System.out.println(list1);
		list1.set(4, 40);
		System.out.println(list1);
		
		System.out.println(list1.contains(5)); // 값 5가 존재하는가
		list1.clear(); //clear(); 리스트 요소 비우기
		System.out.println(list1);
		
		System.out.println(list1.isEmpty());
		System.out.println(list.isEmpty());
		

		
		

	}

}
