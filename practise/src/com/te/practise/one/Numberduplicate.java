package com.te.practise.one;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Numberduplicate {

	public static void main(String[] args) {

		int[] num = {55,44,33,22,11,66,55,44,33};
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			
			if(!set.add(num[i])) {
				list.add(num[i]);
			}
			
			
		}
		System.out.println(list);
		
		
		
		
		
		
		
	}

}
