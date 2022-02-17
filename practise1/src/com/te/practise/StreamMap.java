package com.te.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>() {
			{

				add(89);
				add(45);
				add(23);
				add(78);
				add(8);

			}
		};
		//list.stream().filter(z->z%2==0).collect(Collectors.toList()).forEach(System.out::println);
		list.stream().map(x->x*x).collect(Collectors.toList()).forEach(System.out::println);

	}

}
