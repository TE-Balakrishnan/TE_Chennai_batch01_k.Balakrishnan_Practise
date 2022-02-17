package com.te.mock;

public class SingleTest {

	public static void main(String[] args) {

		SingleTon ton1 = SingleTon.getObject();
		SingleTon ton2 = SingleTon.getObject();
		
		System.out.println(ton1);
		System.out.println(ton2);
		
		
		
	}

}
