package com.ty.array.copy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Noccurence {

	public static void main(String[] args) {

		String str = "krish is a developer";
		String[] nstr = str.split(" ");
		String res = "";
		for (int i = 0; i < nstr.length; i++) {
			res += nstr[i];
		}
		System.out.println(res);
		char[] ch = res.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(Character r : ch) {
			if(hm.containsKey(r)) {
				hm.put(r, hm.get(r)+1);
			}else {
				hm.put(r, 1);
			}
		}
				
		for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
			if(entry.getValue()>1) {
			System.out.println(entry.getKey()+" = " +entry.getValue());
		}
		}
		
System.out.println(hm.toString());
		
		//Set<Character> set = hm.keySet();
		Set<Entry<Character, Integer>> set = hm.entrySet();
		for(Entry<Character, Integer> x : set) {
			if(x.getValue()>1) {
				System.out.println(x.getKey()+"="+x.getValue());
			}
		}
		
		
		
		
		
		
		
	}

}
