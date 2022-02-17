package com.te.practise.one;

public class Reverse {

	public static void main(String[] args) {
		String str = "spring awesome!!";
		String[] str2 = str.split(" ");
		for (int i = 0; i < str2.length; i++) {
			String strnew = "";
			strnew += str2[i];
			for (int j = strnew.length()-1; j >=0; j--) {
				System.out.print(strnew.charAt(j));
			}
			System.out.print(" ");
		}
		
		
		
		
	}

}
