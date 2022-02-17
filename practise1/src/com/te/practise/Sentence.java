package com.te.practise;

public class Sentence {

	public static void main(String[] args) {

		String str = "Krish is Developer";
		String[] arr = str.split(" ");
		for(int i = arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+ " ");
		}

	}

}
