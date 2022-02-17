package com.te.practise.two;

import java.util.Date;

public class SpecialCharacter {

	public static void main(String[] args) {

		String str = "krish@#$%&@#$";

		Date date = new Date();
		System.out.println(date);

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 64 && str.charAt(i) <= 122) {
				System.out.print(str.charAt(i));
			}
		}

	}

}
