package com.te.me.practise;

public class SortTest {

	public static void main(String[] args) {

		int[] arr = {12,34,2,12,34,56,23,45};
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int res = arr[i];
					arr[i]=arr[j];
					arr[j]=res;
				}
			}
		}
		
		for(int i = 0 ;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}

}
