package Javaprograms_Interview;

import java.util.Scanner;

public class FebinocciNumber {

	public static void main(String[] args) {

		// input --6 // output -- 0 1 1 2 3 5
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter febinocci number : ");
		int num = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;

		/*
		 *
		 * 1 - a = 0, b = 1, c = 1  == printed
		 * 2 - a = 1, b = 1, c = 2  == printed
		 * 3 - a = 1, b = 2, c = 3  == printed
		 * 4 - a = 2, b = 3, c = 5  == printed
		 * 5 - a = 3, b = 5 ,c = 8  ==printed
		 */
		while (num > 0) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
			num--;
		}
	}
}
