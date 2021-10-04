package com.practise.assignment;

public class EightBank {
	
	static String bankName, bankaddr;
	static long bankphoneNo;
	static String ifscode = "sbi123";
	int custbalance;
	
	public static void bankdetails(String name, String addr, long phoneNo){
	        bankName=name;
			bankaddr=addr;
			bankphoneNo=phoneNo;
	}
	
	public void withdrawal(int amt){
		custbalance=custbalance-amt;
	}
	public void deposit(int amt){
		custbalance=custbalance+amt;
	}
	public int getbalance(){
		return custbalance;
	}
}


