package com.te.mock;

public class SingleTon {

	private SingleTon() {
	}

	public static SingleTon single=null;

	public static SingleTon getObject() {
		
		if (single == null) {
			single= new SingleTon();
		} 
		return single;

	}
}
