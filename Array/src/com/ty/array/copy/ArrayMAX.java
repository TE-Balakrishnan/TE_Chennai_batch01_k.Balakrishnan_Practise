package com.ty.array.copy;

public class ArrayMAX {

	public static void main(String[] args) {
		
		int[] a = {45,33,22,78,90};
		int max = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println(max);
			
	}

}
