package com.ty.array.copy;

public class RemoveSpecial {

	public static void main(String[] args) {
		
		String str = "#$#@3@#@3Java progra#$$ming";	
			
		String str1 = str.replaceAll("[^a-zA-Z0-9]", "");	
		System.out.println(str1);
	}

}
