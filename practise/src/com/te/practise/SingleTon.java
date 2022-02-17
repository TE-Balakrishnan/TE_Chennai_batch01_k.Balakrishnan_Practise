package com.te.practise;

public class SingleTon {

	private SingleTon() {
	}

	static SingleTon single;

	public static SingleTon getObject() {
		if (single == null) {
			single = new SingleTon();
		}
		return single;

	}

}
