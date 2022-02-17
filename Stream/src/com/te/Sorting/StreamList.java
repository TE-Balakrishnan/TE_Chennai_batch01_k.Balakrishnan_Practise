package com.te.Sorting;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(89);
		list.add(45);
		list.add(34);
		list.add(45);
		list.add(89);
		
	Set<Integer> set  = 	list.stream().map(x->x).collect(Collectors.toSet());
		
		System.out.println(set);
		
	double d =	list.stream().map(x->x).mapToDouble(x->x).sum();
	System.out.println(d);
	
	Stream.of("one", "two", "three", "four")
    .filter(e -> e.length() > 3)
    .peek(e -> System.out.println("Filtered value: " + e))
    .map(String::toUpperCase)
    .peek(e -> System.out.println("Mapped value: " + e))
    .collect(Collectors.toList());
	
	Date date = new Date();
	System.out.println(date);
		
		
	}

}
