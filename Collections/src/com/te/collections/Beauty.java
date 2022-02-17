package com.te.collections;

import java.util.HashMap;
import java.util.Map;

public class Beauty {

	public static void main(String[] args) {

		int num = 3133;
		int temp = num;
		int count = 0;

		Map<Integer, Integer> map = new HashMap<>();

		while (num != 0) {
			int digit = num % 10;
			count++;
			map.put(digit, count);

		}
		
		System.out.println(map);

	}

}
