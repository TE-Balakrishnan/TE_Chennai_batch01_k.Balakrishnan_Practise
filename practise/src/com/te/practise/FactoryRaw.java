package com.te.practise;

public class FactoryRaw {

	public static FactoryI getObject(String name) {

		if (name.equalsIgnoreCase("manager")) {
			return new Manager();
		} else if (name.equalsIgnoreCase("hr")) {
			return new Hr();
		}

		return null;

	}

	

}
