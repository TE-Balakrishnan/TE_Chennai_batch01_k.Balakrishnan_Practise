package com.ty.array.copy;

public class Arraycopysort {

	public static void main(String[] args) {
int[] a = {45,33,-344,33,22,-223,67,66,68};
		
		for(int i = 0,j=i+1;j<a.length;i++,j++) {
			//for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			//}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		//System.out.println(a[a.length-3]);
		
	}

}
