package com.te.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Map1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>() {{
			
			add("krish");
			add("apple");
			add("string");
			add("a");
			//add("z");
			add("a");
			//add("z");
			add("krish");
		}};
		
	//list.stream().map(String::length).filter(x->x>1).collect(Collectors.toList()).forEach(System.out::println);
	//list.stream().filter(x->x.length()>2).collect(Collectors.toList()).forEach(System.out::println);	
	//list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);		
//	  Optional<String> op =    list.stream().max((x1,x2)->x2.compareTo(x1));
//	
//		System.out.println(op.get());
		
		Collections.sort(list, (x,y)->y.compareTo(x));
		System.out.println(list);
		
		String s1 = "abc";
		String s2 = "abc";
		
		String s = new String("abc");
		
		System.out.println(s1==s2);
		System.out.println(s1==s);
		
		
			
	}

}
