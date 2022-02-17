package com.te.finalassesment.string;

public class StringImmutable {

	public static void main(String[] args) {
		
		String str = "krish";
		String str1 = "krish";
		
		System.out.println(str==str1);
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		String str3 = new String("krish");
		System.out.println(str3.hashCode());
		System.out.println(str==str3);
		str = str3;
		System.out.println(str3.hashCode());
		System.out.println(str.hashCode());
		System.out.println(str==str1);
		System.out.println(str);
								
		
	}

}
