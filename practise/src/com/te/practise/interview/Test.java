package com.te.practise.interview;

public class Test {

	public static void main(String[] args) {

	
		
		
		Apple ab = new Orange();
		Orange or = new Orange();
		or.demo();
		Orange s = (Orange)ab;
		
		ab.demo();
		System.out.println(s.a);
		s.demo();
		
		
		
	}

}
