package com.te.practise.one;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Reverse1 {

	public static void main(String[] args) {

		String str = "spring always spring awesome";
		String[] str1 = str.split(" ");
		String res = "";
		for (int i = 0; i < str1.length; i++) {
			res += str1[i];
		}
		System.out.println(res);

		char[] ch = res.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character chr : ch) {
			if(map.containsKey(chr)) {
				map.put(chr, map.get(chr)+1);
			}else {
				map.put(chr, 1);
			}
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

			tm.putAll(map);
			System.out.println(tm);
	}

}
