package com.te.questions;

public class Prime {

	public static void main(String[] args) {

		int a =11,b=1,count=0;
		
		while(b<=a){
			if(a%b==0) {
				count++;
			}
			b++;
		}
		String res = (count==2)?"prime "+a:"not prime "+a;
		System.out.println(res);
		
		
		
		
	}

}
