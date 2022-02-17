package com.te.codehome;

public class FirstandLast {

	public static void main(String[] args) {

		// String str = "this picture is great";
		String str = "this";
		char[] ch = str.toCharArray();

		System.out.println((ch[0] == ch[ch.length - 1]) ? "valid" : "not valid");

	}

}
