package com.ty.array;

public class PerWordReverse {

	public static void main(String[] args) {

		String str = "krish is developer";
		
		String[] newStr = str.split(" ");
		for(int i = 0;i<newStr.length;i++) {
			String res = "";
			res += newStr[i];
			for(int j = res.length()-1;j>=0;j--) {
				System.out.print(res.charAt(j));
			}
			System.out.print(" ");
		}
		
		
		
		
	}

}
