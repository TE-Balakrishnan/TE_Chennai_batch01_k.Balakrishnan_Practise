package com.te.questions;

public class Amstrong {

	public static void main(String[] args) {

		int a = 1634;
		int temp = a;
		int res = 0;

		while (a != 0) {
			int d = a % 10;
			res = res + (d * d * d * d);
			a = a / 10;
		}
		String result = (temp == res) ? "amstrong" : "not amstrong";
		System.out.println(result);

	}

}
