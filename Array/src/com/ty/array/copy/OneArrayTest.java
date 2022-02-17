package com.ty.array.copy;

public class OneArrayTest {

	public static void main(String[] args) {

		OneArray one = new OneArray();
		one.add(8);
		one.add(4);
		one.add(2);
		one.add(45);
		System.out.println(one.toString());
		one.remove(1);
		System.out.println(one.toString());
		
		
	}

}
