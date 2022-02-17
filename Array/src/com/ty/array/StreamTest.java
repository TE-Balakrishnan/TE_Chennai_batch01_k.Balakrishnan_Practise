package com.ty.array;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.add(34);
		list.add(344);
		list.add(23);
		list.add(78);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("-----------------------------------------");

		list.stream().map(x -> x).forEach(x -> System.out.println(x));

	}

}
