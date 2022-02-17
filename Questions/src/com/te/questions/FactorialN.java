package com.te.questions;

public class FactorialN {

	public static void main(String[] args) {

		for(int i = 1; i<=10;i++) {
			int numb = i;
			int fact = 1;
			while(numb!=0) {
				fact = fact*numb--;
				
			}
			System.out.println(fact);
		}
		
		
		
		
	}

}
