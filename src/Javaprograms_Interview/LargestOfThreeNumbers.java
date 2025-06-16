package Javaprograms_Interview;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {

		LargestElementInArray();
		// terinaryOperator();

	}

	public static void normalMethod() {
		// By Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers - each number followed by a space");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if ((a > b) && (a > c)) {
			System.out.println(a);
		} else if ((a > b) && (a < c)) {
			System.out.println(c);
		} else if ((a < b) && (a > c)) {
			System.out.println(b);
		} else if ((a < b) && (a < c)) {
			if (b > c)
				System.out.println(b);
			else
				System.out.println(c);
		}
	}

	// Using terinary operator
	public static void terinaryOperator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers - each number followed by a space");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int largeOne = a > b ? a : b;
		int largest = largeOne > c ? largeOne : c;
		System.out.println("Largest of three numbers is - " + largest);
	}

	// In Array
	public static void LargestElementInArray() {
		int[] ar = { 44, 3, 4, 9, 77, 254, 11, 88, 2, 322 };
		int largest = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (largest < ar[i]) {
				largest = ar[i];
			}
		}
		System.out.println("Largest element in array is - " + largest);
	}
}
