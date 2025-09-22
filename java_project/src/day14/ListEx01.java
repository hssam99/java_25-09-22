package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {
		
		
		String[] arr1 = {"a", "t", "y", "s", "d"};
		String[] arr2 = {"b", "u", "c", "z", "g"};
		
		List<String> list1 = new ArrayList<>(Arrays.asList(arr1));
		List<String> list2 = new ArrayList<>(Arrays.asList(arr2));
		

		list1.addAll(list2);
		System.out.println(list1);
		
		
		
//		for(String s : arr1) {
//			list.add(s);
//		}
//		for(String s : arr2) {
//			list.add(s);
//		}
//		
//		Collections.sort(list);
//		System.out.println(list);

	}

}
