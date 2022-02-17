package com.te.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterSort {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(400);
		list.add(700);
		list.add(500);
		list.add(200);
		list.add(1000);
		
		list.stream().filter(a->a>500).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("-----------------");
		long ab =	list.stream().filter(a->a>500).map(a->a+500).count();//.collect(Collectors.toList());//.forEach(System.out::println);
		System.out.println(ab);
		list.stream().filter(a->a==200).forEach(System.out::println);
		
	}

}
