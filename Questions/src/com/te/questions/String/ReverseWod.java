package com.te.questions.String;

public class ReverseWod {

	public static void main(String[] args) {

		String str = "krish is developer";
		String[] res = str.split(" ");
		for (int i = res.length - 1; i >= 0; i--) {
			System.out.print(res[i] + " ");
		}

	}

}
