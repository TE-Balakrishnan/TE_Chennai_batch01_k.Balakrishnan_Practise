package com.practise.assignment;

import java.util.Scanner;

public class SeventeenTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email ID");
		String mail = sc.next();
		System.out.println("Enterpassword");
		String pin = sc.next();

		Seventeen ref = new Seventeen();

		try {
			ref.check(mail, pin);
		} catch (UnAuthorizedUserException e) {
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}
