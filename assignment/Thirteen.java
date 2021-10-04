package com.practise.assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Thirteen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mobilenumber");
		try {
			int a = sc.nextInt();

			try {
				int[] arr = { 'k', 'r', 'i', 's', 'h' };
				System.out.println("Enter position number");
				int b = sc.nextInt();
				System.out.println(arr[b]);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Enter valid details");
			}

		} catch (Exception e) {
			System.out.println("number only");
		}

		sc.close();

	}

}
