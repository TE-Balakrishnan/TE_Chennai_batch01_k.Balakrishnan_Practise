package com.te.questions.String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Repeat {

	public static void main(String[] args) {

		String str = "krish is krish is a a is";
		
		String[] s = str.split(" ");
		List<String> list = new ArrayList<String>();
		HashSet<String> hset = new HashSet<String>();
		for (String string : s) {
			if(hset.add(string)) {
				list.add(string);
			}
		}
		System.out.println(list);
		
		
		
		
	}

}
