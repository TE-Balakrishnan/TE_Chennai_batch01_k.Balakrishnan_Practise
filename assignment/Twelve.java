package com.practise.assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Twelve {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mobilenumber");
		try {
			int a = sc.nextInt();
			System.out.println("Enter values");
			int b = sc.nextInt();
			int c = sc.nextInt();
			int data = b/c;
			System.out.println(data);
		} catch (InputMismatchException e) {
			System.out.println("invalid data entered");
		}catch(Exception e) {
			System.out.println("error");
		}
		sc.close();
	}
}
		
		




