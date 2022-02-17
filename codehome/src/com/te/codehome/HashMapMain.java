package com.te.codehome;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
	
	
	public static int sizeOfResultandHashMap(int a, int integer, String str) {
		int count = 0;
		HashMap<Integer, String> map = new HashMap<Integer, String>(a);
		map.put(integer	, str);
	for(	Map.Entry<Integer, String> entry : map.entrySet()) {
		if(entry.getKey()%4==0) {
			count++;
		}
	}
	return count;
		
		
		
	}

}
