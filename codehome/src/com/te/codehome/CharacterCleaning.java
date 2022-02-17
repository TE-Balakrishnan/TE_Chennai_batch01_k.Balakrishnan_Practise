package com.te.codehome;

public class CharacterCleaning {

	public static void main(String[] args) {

		String str = "elephantl";

		char[] res = str.toCharArray();

		char ch = 'l';

		String result = "";

		for (int i = 0; i < res.length; i++) {
			if ((res[i] == ch)) {
				// System.out.println("not valid strings");
			} else {
				result += res[i];
			}
		}

		System.out.println(result);

	}

}
