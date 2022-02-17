package com.te.me.practise1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(10, "krish"));
		list.add(new Employee(13, "zoro"));
		list.add(new Employee(45, "mars"));
		list.add(new Employee(78, "Ash"));

		System.out.print(list);

		list.stream().sorted((x, y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList())
				.forEach(System.out::println);

	}

}
