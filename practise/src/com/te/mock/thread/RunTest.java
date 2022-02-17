package com.te.mock.thread;

public class RunTest {

	public static void main(String[] args) {

		Runnable r1 = ()->{
			System.out.println("first thread");
		};
		
		Runnable r2  =()->{
			System.out.println("second thread");
		};
		
		Thread one = new Thread(r1);
		Thread two = new Thread(r2);
		
		one.start();
		two.start();
		
		
		
		
	}

}
