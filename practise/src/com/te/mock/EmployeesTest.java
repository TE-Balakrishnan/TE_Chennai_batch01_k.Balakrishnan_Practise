package com.te.mock;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.te.me.practise1.Employee;

public class EmployeesTest {

	public static void main(String[] args) {
		List<Employees> list = new ArrayList<Employees>();

		list.add(new Employees(10, "krish"));
		list.add(new Employees(13, "zoro"));
		list.add(new Employees(45, "mars"));
		list.add(new Employees(78, "Ash"));
		list.add(new Employees(10, "krish"));

		//System.out.print(list);

//		list.stream()
//		         .sorted((x, y) -> x.getName().compareTo(y.getName()))
//				 .collect(Collectors.toList())
//				 .forEach(System.out::println);
		
		
		Set<Employees> set = new HashSet<>(list);
		System.out.print(set);

	}
}
