package com.te.questions.array;

public class Sorting {

	public static void main(String[] args) {

		int[] arr = {5,43,3,34,5,6,8,9};
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int num = arr[i];
					arr[i]=arr[j];
					arr[j]=num;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
	}

}
