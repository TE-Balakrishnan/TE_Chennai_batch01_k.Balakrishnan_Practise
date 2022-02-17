package com.te.questions.String;

public class Duplicatestring {

	public static void main(String[] args) {

		String str = "newString";

		char[] ch = str.toCharArray();
		for(int i = 0;i<=ch.length;i++) {
			for (int j = 1+i; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[i]);
				}
			}
			
			
		}
			
	}

}
