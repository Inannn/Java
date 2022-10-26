package com.cohart20.io;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter first number!");

		int firstNumber = sc.nextInt();

		System.out.println("Please enter second number");

		int secondNumber = sc.nextInt();

		int result = firstNumber + secondNumber;

		System.out.println("The addition of 2 numbers is "+result);


	}
}

