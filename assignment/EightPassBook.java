package com.practise.assignment;

public class EightPassBook extends EightCustomer {

	public void printpassbook() {
		System.out.println("Bank_Name------------------------->" + bankName);
		System.out.println("Bank_Address---------------------->" + bankaddr);
		System.out.println("Bank_PhoneNO---------------------->" + bankphoneNo);
		System.out.println("Bank_IFSC CODE-------------------->" + ifscode);

		System.out.println("Customer_Name--------------------->" + custName);
		System.out.println("Customer_Address------------------>" + custaddr);
		System.out.println("Customer_emaiID------------------->" + custemailId);
		System.out.println("Customer_AccountNO---------------->" + custaccNo);
		System.out.println("Customer_Balance------------------>" + custbalance);
	}

}
