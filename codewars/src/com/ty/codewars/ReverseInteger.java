package com.ty.codewars;

public class ReverseInteger {

	public static void main(String[] args) {

		final int num = 4567876;

		int sum = num;
		int temp = sum;
		int count1 = 0;

		while (temp != 0) {
			count1++;
			temp = temp / 10;
		}

		int[] arr = new int[count1];
		int count = 0;
		while (sum != 0) {
			int res = sum % 10;
			arr[count++] = res;
			sum = sum / 10;

		}
		System.out.println(count1);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1+i; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					int t = arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		

	}

}
