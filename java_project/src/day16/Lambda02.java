package day16;

import java.util.HashMap;
import java.util.Map;

public class Lambda02 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("James", 89);
		map.put("Mike", 96);
		map.put("Lisa", 72);
		map.put("Amy", 88);
		map.put("Kate", 92);
		
//		int sum = 0;
		
		// 매개변수는 2개까지, 3개 이상 불가능
		map.forEach((a,b)->{
			System.out.println(a+":"+b);
		});
		
		
		
		Number sum = (a,b) -> {
			return a+b;
		};
		
		Number max = (a,b) -> {
			return (a>=b) ? a:b;
		};
		
		int s = sum.add(10, 20);
		System.out.println(s);
		System.out.println(max.add(10, 20));
		
	}
	

}




//람다용 함수형 인터페이스 생성
//메소드는 반드시 1개여야함

@FunctionalInterface
interface Number{
	// 메소드 추가
	int add(int a, int b);
//	int max(int a, int b);
}
