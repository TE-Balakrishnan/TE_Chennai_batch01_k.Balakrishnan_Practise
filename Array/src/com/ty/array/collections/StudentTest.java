package com.ty.array.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentTest {
	
	public static void main(String[] args) {
		
	List<Student> list = new ArrayList<Student>() {{
		
		add(new Student(109, "kris", 80, 20));
		add(new Student(102, "akash", 90, 20));
		add(new Student(103, "arvndh", 50, 20));
		add(new Student(104, "vasu", 70, 10));
	}};
	//System.out.println(list);
	//list.stream().filter(a->a.getDept()==20&&a.getMarks()>50).collect(Collectors.toList()).forEach(System.out::println);

	Comparator<Student> com = (e1,e2)->{
		return e2.getMarks()-e1.getMarks();
	};
	
	
	
List<Student> nlist	=list.stream().sorted(com).collect(Collectors.toList());
	//System.out.print(nlist);
	for (Student student : nlist) {
		System.out.println(student);
	}
	
	}
}
