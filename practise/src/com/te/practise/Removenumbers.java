package com.te.practise;

public class Removenumbers {

	public static void main(String[] args) {

		String str = "krish123";
		char[] ch = str.toCharArray();
		String result = "";
		for (int i = 0; i < ch.length; i++) {
			if(!Character.isDigit(ch[i])) {
				result += ch[i];
			}
		}
		System.out.println(result);
		
		

	}

}
