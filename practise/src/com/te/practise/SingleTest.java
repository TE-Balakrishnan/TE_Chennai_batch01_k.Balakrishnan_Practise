package com.te.practise;

public class SingleTest {

	public static void main(String[] args) {

		SingleTon one = SingleTon.getObject();
		SingleTon two = SingleTon.getObject();
		
		System.out.println(one.hashCode());
		System.out.println(two.hashCode());
		
		
		
	}

}
