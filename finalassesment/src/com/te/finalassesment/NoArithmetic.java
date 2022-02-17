package com.te.finalassesment;

public class NoArithmetic {

	static int add(int x, int y) {

		if (y == 0) {
			return x;
		} else {
			return add(x ^ y, (x & y) << 1);
		}

	}

	public static void main(String[] args) {

		System.out.println(add(12, 10));

	}

}
