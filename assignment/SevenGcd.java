package com.practise.assignment;

import java.util.Scanner;

public class SevenGcd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();

		System.out.println("Enter the second number");
		int b = sc.nextInt();

		System.out.println("The divisor of first number are");
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				System.out.println(i);
			}
		}
		System.out.println("-------------------------------------------");

		System.out.println("The divisor of second number are");
		for (int j = 1; j <= b; j++) {
			if (a % j == 0) {
				System.out.println(j);
			}
		}

	}

}
