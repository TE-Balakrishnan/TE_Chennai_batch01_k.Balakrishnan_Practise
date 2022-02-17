package com.te.practise.one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {

		String str = "big black bug black bug back bug";
		String[] str1 = str.split(" ");
		List<String> list = new ArrayList<String>();
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < str1.length; i++) {

			if (set.add(str1[i])) {
				list.add(str1[i]);
			}

		}
		System.out.println(list);

	}

}
