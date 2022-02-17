package com.te.collections;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

	public static void main(String[] args) {
		String str = "hello world hello world";
		String[] str1 = str.split(" ");
		String res = "";
		for (int i = 0; i < str1.length; i++) {
			res += str1[i];
		}

		System.out.println(res);
		char[] ch = res.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char find : ch) {
			if (map.containsKey(find)) {
				map.put(find, map.get(find) + 1);
			} else {
				map.put(find, 1);
			}

		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey()+""+entry.getValue());
		}

	}

}
