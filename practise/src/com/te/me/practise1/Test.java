package com.te.me.practise1;

public class Test {

	void check(String msg) {
		if ("krish".equals(msg)) {
			System.out.println("valid");
		} else {
			throw new InvalidCredentialsException("invalid user");
		}
	}

	public static void main(String[] args) {

		Test test = new Test();
		test.check("hello");

	}

}
