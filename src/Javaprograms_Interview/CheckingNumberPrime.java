package Javaprograms_Interview;

import java.util.Scanner;

public class CheckingNumberPrime {

	public static void main(String[] args) {
		int[] array = { 3, 5, 9, 16, 23, 79 };
		primeInArray(array, array.length);
	}

	// Checking single number
	public static void primeNumberCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		int count = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		System.out.println(count);
		if (count > 0)
			System.out.println("Its not prime number");
		else
			System.out.println("Its prime number");
	}
	// checking in array

	public static void primeInArray(int[] ar, int len) {

		// {34, 67, 89}

		int prime = 0, nonprime = 0;

		for (int i = 0; i < len; i++) {
			int element = ar[i];
			int counter = 0;
			for (int j = 2; j < element; j++) {
				if (element % j == 0) {
					counter++;
				}
			}
			if (counter > 0)
				prime++;
			else
				nonprime++;
		}

		System.out.println("Total primes in Array are : " + prime + " and non-primes are : " + nonprime);

	}
}
