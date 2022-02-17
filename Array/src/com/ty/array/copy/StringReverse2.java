package com.ty.array.copy;

public class StringReverse2 {

	public static void main(String[] args) {
		
		String str = "krish is developer";
		
		String[] nstr = str.split(" ");
		for(int i = 0;i<nstr.length;i++) {
			String s = "";
			s = nstr[i];
			for (int j =s.length()-1;j>=0;j--) {
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");
		}
			
			
	}

}
