package com.te.questions;

public class AmstronNew {

	public static void main(String[] args) {

		int a = 153, temp =a,numb=temp,sum1=0,count=0;
		while(a!=0) {
			count++;
			a = a/10;
		}
		while(temp!=0) {
			int digit = temp%10;
			int sum =	1;
			for(int i = 0; i<count;i++) {				//1 and <=
				sum = sum*digit;
			}
			sum1 +=sum;
			temp = temp/10;
		}
		String result = (sum1==numb)?"amstrong "+sum1:"notamstrong";
		System.out.println(result);
		
		
		
	}

}
