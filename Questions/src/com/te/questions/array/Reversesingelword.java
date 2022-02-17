package com.te.questions.array;

public class Reversesingelword {

	public static void main(String[] args) {

		String str = "krish is a developer";
		String[] str1 = str.split(" ");
		String s ="";
		for (int i = 0; i < str1.length; i++) {
			s +=(str1[i]+" ");
		}
		System.out.println(s);
		for (int i = s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		
		
		
		
		
		
		
	}

}
