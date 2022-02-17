package com.te.finalassesment;

public class Array1Test {

	public static void main(String[] args) {

		Array1 ar = new Array1();
		ar.add(9);
		ar.add(45);
		ar.add(38);
		ar.add(23);
		
		System.out.println(ar);
		ar.remove(1);
		System.out.println(ar);
		ar.set(1, 999);
		System.out.println(ar);
		System.out.println(ar.size());
		ar.set(1, 888);
		System.out.println(ar);
		
		
		
		
	}

}
