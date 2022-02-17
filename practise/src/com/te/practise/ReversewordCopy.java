package com.te.practise;

public class ReversewordCopy {

	public static void main(String[] args) {

		String str = "spring is awesome";

		String[] res = str.split(" ");

//		for(int i = res.length-1;i>=0;i--) {
//			System.out.print(res[i]+" ");
//		}

		for (int i = 0; i < res.length; i++) {
			String run ="";
			run += res[i];
			for (int j = run.length() - 1; j >= 0; j--) {
				System.out.print(run.charAt(j));
			}
			System.out.print(" ");
		}

	}

}
