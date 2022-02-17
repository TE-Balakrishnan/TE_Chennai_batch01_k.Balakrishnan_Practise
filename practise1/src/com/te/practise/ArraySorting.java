package com.te.practise;

public class ArraySorting {

	public static void main(String[] args) {

		int[] arr = {45,2,3,22,3,34,1,2,0};
		for(int i = 0; i<arr.length; i++) {
			for(int j = 1+i; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
	}

}
