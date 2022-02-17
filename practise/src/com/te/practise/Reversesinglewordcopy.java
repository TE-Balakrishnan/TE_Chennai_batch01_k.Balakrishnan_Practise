package com.te.practise;

public class Reversesinglewordcopy {

	public static void main(String[] args) {

		String str = "spring is awesome!";
		String[] str1 = str.split(" ");

		for (int i = 0; i < str1.length; i++) {
			String nstr = "";
			nstr += str1[i];
			for (int j = nstr.length() - 1; j >= 0; j--) {
				System.out.print(nstr.charAt(j));
			}
			System.out.print(" ");
		}

	}

}
