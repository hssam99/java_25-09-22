package day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordController {

	private Map<String, String> wordBook = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	
	// true > 동일한 단어가 존재 
	// false > 동일한 단어가 존재하지 않음
	public boolean checkEquality(String eng) {
		boolean result = false;
		for (String s : wordBook.keySet()) {
			if (s.equals(eng)) {
				result = true;
			}
		}
		return result;
	}
	
	
	public void addWordSet() {
		wordBook.put("dog", "강아지");
		wordBook.put("cat", "고양이");
		wordBook.put("lion", "사자");
		wordBook.put("tiger", "호랑이 ");
		wordBook.put("apple", "사과");
	}
	
	
	public void addWord(Scanner sc) {
		System.out.print("단어>");
		String eng = sc.next();
		
		if(checkEquality(eng)) {
			System.out.println("이미 등록된 단어입니다.");
		}else {
			System.out.print("뜻>");
			String kor = sc.next();
			wordBook.put(eng, kor);
			System.out.println("단어가 추가되었습니다.");
		}
		
		
	}

	public void searchWord(Scanner sc) {
		System.out.print("단어 검색 >");
		String word = sc.next();
		
		if(checkEquality(word)) {
			System.out.println("---검색결과---");
			System.out.println(wordBook.get(word));
		}else {
			System.out.println("등록되지 않은 단어입니다.");
		}

	}

	public void updateWord(Scanner sc) {
		System.out.print("수정할 단어 검색 >");
		String word = sc.next();
		
		if(checkEquality(word)) {
			System.out.print("새로운 값 입력>");
			wordBook.put(word, sc.next());
			System.out.println("수정되었습니다.");
		}else {
			System.out.println("등록되지 않은 단어입니다.");
		}
		

	}

	public void printWord(Scanner sc) {
		int i = 0;
		System.out.println("------Word Book------");
		for (String s : wordBook.keySet()) {
			System.out.println((i+1)+"| "+s+" : "+wordBook.get(s));
			i++;
		}
		
		System.out.println("--------------------");

	}

	public void deleteWord() {
		System.out.print("삭제할 단어 검색 >");
		String word = sc.next();
		
		if(checkEquality(word)) {
			wordBook.remove(word);
			System.out.println("삭제되었습니다.");
		}else {
			System.out.println("등록되지 않은 단어입니다.");
		}
		

	}

}
