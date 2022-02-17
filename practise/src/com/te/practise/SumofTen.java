package com.te.practise;

public class SumofTen {

	public static void main(String[] args) {
		
		int[] a = {2,4,8,6};
		for(int i = 0;i < a.length;i++) {
			for(int j = 1; j < a.length;j++ ) {
				if(a[i]+a[j]==10) {
					System.out.println("Sum="+a[i]+"+"+a[j]+"=10");
				}
			}
		}
		
			
	}

}
