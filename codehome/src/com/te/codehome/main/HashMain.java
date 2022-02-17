package com.te.codehome.main;

import java.util.HashMap;
import java.util.Scanner;

import com.te.codehome.HashMapMain;

public class HashMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of hash map");
		int a = sc.nextInt();
		System.out.println("enter key and value one by one");
		int integer = sc.nextInt();
		String string = sc.nextLine();
		
		System.out.println(HashMapMain.sizeOfResultandHashMap(a, integer, string));
		
		
		
	}

}
