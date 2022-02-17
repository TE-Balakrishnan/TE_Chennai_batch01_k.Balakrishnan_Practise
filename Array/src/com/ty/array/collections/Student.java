package com.ty.array.collections;

import java.util.Comparator;

public class Student  {
	
	
	private int id;
	private String name;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}
	private int marks;
	private int dept;
	
	
	public int getDept() {
		return dept;
	}
	public void setDept(int dept) {
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	/*
	 * @Override public int compare(Student o1, Student o2) { return o1.marks -
	 * o2.marks; }
	 */
	public Student(int id, String name, int marks, int dept) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", dept=" + dept + "]";
	}
	
	
	
	
	
	
	
	
	

}
