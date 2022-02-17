package com.te.questions.String;

import java.util.HashMap;
import java.util.Map;

public class Duplicateoccurence {

	public static void main(String[] args) {

		String str = "krish is krish";
		String[] res = str.split(" ");
		String got = "";
		for (int i = 0; i < res.length; i++) {
			got += (res[i]);
		}
		//System.out.println(got);
		char[] get = got.toUpperCase().toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : get) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
			map.put(ch, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ "="+entry.getValue());
		}

	}

}
