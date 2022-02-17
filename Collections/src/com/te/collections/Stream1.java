package com.te.collections;

import java.util.HashMap;
import java.util.Map;

public class Stream1 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		
				map.put(1, "krish");
				map.put(2, "harsh");
				map.put(99, "arun");
				map.put(45, "arvndh");
				map.put(5, "sort");
				
				//map.entrySet().stream().filter(x->x.getValue().startsWith("a")).forEach(System.out::println);
				
				map.entrySet().stream().sorted((x,y)->y.getValue().compareTo(x.getValue())).forEach(System.out::println);
		
			//	map.entrySet().stream().sorted((x,y)->y.getKey()-x.getKey()).forEach(System.out::println);
		
				
				
				
	}

}
