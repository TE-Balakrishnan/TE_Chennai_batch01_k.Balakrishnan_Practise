package com.practise.assignment;

public class EightCustomer extends EightBank {
	
	String custName, custemailId, custaddr;
	int custaccNo;
	
	public void custDetails(String custName, String custaddr, String custemailId, int custbalance, int custaccNo){
		this.custName=custName;
		this.custaddr=custaddr;
		this.custemailId=custemailId;
		this.custbalance=custbalance;
		this.custaccNo=custaccNo;
	}
	 
}


