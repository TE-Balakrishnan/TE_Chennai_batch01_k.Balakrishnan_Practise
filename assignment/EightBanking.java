package com.practise.assignment;

public class EightBanking extends EightPassBook {

	public static void main(String[] args) {

		EightBank.bankdetails("State Bank of India", "chennai", 959566666l);

		EightBanking obj1 = new EightBanking();
		obj1.custDetails("krish", "chennai", "krish@gmail.com", 25000, 101);

		obj1.withdrawal(0);
		obj1.deposit(5000);
		obj1.printpassbook();
		System.out.println("check_Balance----------------------------------->" + obj1.getbalance());

		System.out.println("*************************************************************************************");

		EightBanking obj2 = new EightBanking();
		obj2.custDetails("bala", "chennai", "bala@gmail.com", 10000, 102);
		obj2.withdrawal(0);
		obj2.deposit(0);
		obj2.printpassbook();

	}

}
