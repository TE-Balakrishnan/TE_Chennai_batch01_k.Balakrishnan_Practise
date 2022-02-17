package com.te.questions;

public class CopyPrime {

	public static void main(String[] args) {

		int num = 11;
		int temp = 1;
		int count = 0;
		while(num>=temp) {
			
			if(num%temp==0) {
				count++;
			}
			temp++;
			
		}
		String str = (count==2)?"prime "+num:"not prime "+num;
		System.out.println(str);
		
		
		
		
	}

}
