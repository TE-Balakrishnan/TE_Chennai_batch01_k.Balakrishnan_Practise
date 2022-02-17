package com.te.mock;

public class Vowels {

	public static void main(String[] args) {

		String str = "aabbi";
		
		char[] ch = str.toCharArray();
		for(int i = 0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				System.out.println("this is vowel word");
				break;
			} else {
				System.out.println("no vowels");
				break;
			}
		}
		
	}

}
