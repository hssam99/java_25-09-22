package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection {

	public static void main(String[] args) {
		/*
		 * 컬렉션 프레임워크: 표준화된 방식의 자료구조
		 * List, Set, Map => 인터페이스. 반드시 구현클래스로 객체를 생성
		 * 배열처럼 데이터를 묶어서 관리할 때 사용
		 * 배열 대신 사용
		 * 
		 * List(배열과 동일)
		 * - 같은 타입의 값을 하나씩 저장
		 * - 순서를 보장(index)
		 * - 중복허용
		 * - 배열 대신 가장 많이 사용되는 구조
		 * 
		 * Set
		 * - 같은 타입의 값을 하나씩 저장
		 * - index 없음 => 순서 보장 X
		 * - 중복 허용 X => 같은 값이 들어오면 덮어쓰기
		 * 
		 * Map ( 파이썬의 dictionary)
		 * - 값을 두개씩 저장 key/value 쌍으로 묶어서 저장
		 * - 순서를 보장하지 않음 (index X)
		 * - key는 중복 불가능 > 중복시 덮어쓰기
		 * 
		 * 
		 * Collection에서는 기본자료형은 불가능. 클래스 자료형만 가능.
		 * 기본자료형에 맞는 클래스자료형(Wrapper Class)을 사용하면 됨.
		 * 
		 * 
		 * Wrapper Class(래퍼클래스)
		 * 기본타입에 대응되는 클래스 타입을 래퍼 클래스 라고 함.
		 * 기본 타입		클래스 타입
		 * int			Integer
		 * char			Character
		 * double		Double
		 * long			Long
		 * byte			Byte
		 * boolean		Boolean
		 * 
		 * int char를 제외한 다른 자료형은 첫글자만 대문자로 변환하면 래퍼클래스가됨
		 * 
		 * 
		 * 기본타입 => 클래스 타입(박싱 : boxing)
		 * 클래스타입 => 기본타입 (언박싱 : unboxing)
		 * 
		 * - 언박싱 이유
		 * - 래퍼 클래스는 산술연사을 위해 정의된 클래스가 아님
		 * - 객체의 값만 참조할 수 있기 때문에 그안에 저장된 값은 직접 변경이 불가능
		 * - 그래서 래퍼 클래스로 언박싱해서 기본타입으로 변경한 후 값 변경을 하고 다시 박싱 해야함.
		 * 
		 * 
		 * List<클래스명> 객체명 = new 구현클래스<클래스명>();
		 * 
		 * List => ArrayList(조회), LinkedList(추가, 삭제) ...
		 * Set => HashSet, TreeSet(정렬) ...
		 * Map => HashMap, TreeMap
		 * 
		 * 
		 * 
		 * ArrayList : 검색이 빠르다(배열과 비슷)
		 * - 미리 길이를 지정하지 않음.
		 * - 추가되면 자동으로 늘어남.
		 * - 삭제되면 자동으로 줄어듬.
		 * 
		 * LinkedList : 추가 삭제가 빠름. 검색이 느림.
		 * TreeSet : 트리 구조에 맞게 정렬 알고리즘을 사용함.
		 * 
		 */
		
		
		// List 기준으로 생성
		List<Integer> list1 = new ArrayList<Integer>();
		
		// ArrayList 기준으로 생성
		ArrayList<Integer> list2 = new ArrayList<>();
		
		// 클래스명을 생략하고 생성 => Object로 생성
		ArrayList list3 = new ArrayList<>();
		
		// 앞쪽 클래스명은 반드시 지정, 뒷쪽 클래스명은 생략가능.
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		
		
		
		
		
		
		
	}

}
