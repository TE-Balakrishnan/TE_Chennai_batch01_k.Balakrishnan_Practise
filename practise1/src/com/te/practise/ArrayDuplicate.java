package com.te.practise;

public class ArrayDuplicate {

	public static void main(String[] args) {

		int[]	 arr = {5,4,3,2,1,2,3,4,7,8,9};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]==10) {
					System.out.println(arr[i]+" "+arr[j]+" =10");
				}
			}
		}
		
		
		
	}

}
