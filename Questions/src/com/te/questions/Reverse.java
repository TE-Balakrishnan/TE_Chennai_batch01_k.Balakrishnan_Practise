package com.te.questions;

public class Reverse {

	public static void main(String[] args) {

		for (int i = 0; i <= 1000; i++) {

			int a = i;
			int temp = a;
			int rev = 0;

			while (a != 0) {
				int digit = a % 10;
				rev = rev * 10 + digit;
				a = a / 10;
			}
			if(temp == rev) {
				System.out.println(temp);
			}
		}
		

	}

}
