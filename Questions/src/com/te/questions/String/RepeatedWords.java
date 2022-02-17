package com.te.questions.String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RepeatedWords {

	public static void main(String[] args) {

		String str ="krish is krish is a developer a ";
		String[] res = str.split(" ");
		List<String> list = new ArrayList<String>();
		
		HashSet<String> removed = new HashSet<String>();
				for (String string : res) {
					if(!removed.add(string)) {
						list.add(string);
					}
				}
				System.out.print(list);
		
	}

}
