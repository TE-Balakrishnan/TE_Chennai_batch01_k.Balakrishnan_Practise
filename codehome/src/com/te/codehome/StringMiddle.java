package com.te.codehome;

public class StringMiddle {

	public static void main(String[] args) {

		 String str = "this";
		 int len = str.length();
		// char[] ch = str.toCharArray();
		 if(len%2==0) {
			 System.out.print(str.charAt((len/2)-1));
			 System.out.print(str.charAt(len/2));
		 } else {
			 System.out.print(str.charAt(len/2));
		 }

		
	}

}
