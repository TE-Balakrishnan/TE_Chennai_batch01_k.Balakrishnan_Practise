package com.te.practise;

public class Reversewords {

	public static void main(String[] args) {

		String str ="krish is developer";
		String[] str1 = str.split(" ");
		
			for (int i = 0; i < str1.length; i++) {
				String strnew = "";
				      strnew += str1[i];
				      for (int j =strnew.length()-1; j>=0; j--) {
				    	  System.out.print(strnew.charAt(j));
				      }
				      System.out.print(" ");
			}
		
		
		
		
		
	}

}
