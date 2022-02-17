package com.te.collections;

public class JoinString {

	public static void main(String[] args) {

		String str = "hello hii , , hii hello";
		
		String[] res = str.split(" ");
		String run = "";	
		for (String string : res) {
			run += string;
		}
		System.out.println(run);
		
		
	}

}
