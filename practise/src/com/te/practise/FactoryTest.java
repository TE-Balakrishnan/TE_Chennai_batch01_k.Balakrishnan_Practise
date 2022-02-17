package com.te.practise;

public class FactoryTest {

	public static void main(String[] args) {

		FactoryI one = FactoryRaw.getObject("manager");
		one.getDesgination();
		FactoryI two = FactoryRaw.getObject("Hr");
		two.getDesgination();
		
		
		
	}

}
