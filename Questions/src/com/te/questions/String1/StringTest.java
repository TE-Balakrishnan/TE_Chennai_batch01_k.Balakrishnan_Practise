package com.te.questions.String1;

public class StringTest {

	public static void main(String[] args) {

		String s = "hello";
		
		String s2 = "hello";
		
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		
		s2 = "abc";
		
		System.out.println(s==s2);
		
		String s3 = new String("abc");
		System.out.println(s2==s3);
		
		String s4 = new String("abc");
		
		System.out.println(s4==s3);
		
		
		
		
	}

}
