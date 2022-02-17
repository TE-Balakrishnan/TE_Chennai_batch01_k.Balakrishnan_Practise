package com.te.practise;

public class Specialcharacters {

	public static void main(String[] args) {

		String str = "java AAAAZZz is pro#@$#$%%&*grammingLanguge";
		String res ="";
		
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i)>=65&&str.charAt(i)<=122) {
					res += str.charAt(i);
				}
			}
			System.out.println(res);
		
		
		

	}

}
