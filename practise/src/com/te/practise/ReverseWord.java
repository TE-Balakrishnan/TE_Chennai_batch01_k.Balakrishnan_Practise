package com.te.practise;

public class ReverseWord {

	public static void main(String[] args) {

		String str = "spring_is_awesome";
		String[] str1 = str.split("_");
		for (int i = str1.length-1;i>=0; i--) {
			System.out.print(str1[i]+" ");
		}
		
		
		
	}

}
