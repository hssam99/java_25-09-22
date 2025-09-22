package day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Lambda01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Lambda ; 람다식(식을 단순하게 표현하는 방법)
		 * () -> {}
		 * 메소드를 간결한 함수식으로 표현한 것.
		 * 
		 * lambda : 외부 자료의 부수적인 영향을 주지 않도록 구현하는 방식
		 * stream : 자료의 대상과 상관없이 동일한 연산을 수행할 수 있도록 해주는 반복자
		 * - 메소드 체이닝 기법
		 * 
		 * - 람다의 장점: 코드 간결성, 병렬처리, 불필요한 연산 최소화
		 * - 람다의 단점: 가독성 떨어짐, 반복문 사용시 성능저하
		 * 
		 * - 람다 표현식
		 * (매개변수 -> {구현;}
		 * - 매개변수가 1개면 () 생략 가능
		 * - a -> {return a+1;} // 변수 a 밖에 없으므로 () 생략 가능
		 * - (a,b) -> {return a+b;} // () 생략 불가능
		 * 
		 * return이 없는 경우 {} 생략 가능
		 * - (a,b) -> a+b;
		 * - a -> return a; // 오류 {} 있어야함
		 */
//
//		String a = "abcdef@naver.com";
//		a.substring(0, 5).concat("bcd").indexOf("@");
		
		
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		
		
		// 일반적인 출력방법
		for(Integer i : list) {
			System.out.println(i);
		}
		
		//람다식 표현
		System.out.println("-----lambda-----");
		list.forEach(n -> {
			System.out.println(n);
		});
		
		
		Consumer<Integer> method01 = (n) -> {
			System.out.println(n+" ");
		};
		
		System.out.println("----Consumer----");
		list.forEach(method01);
		
		
		
		
		
	}

}
