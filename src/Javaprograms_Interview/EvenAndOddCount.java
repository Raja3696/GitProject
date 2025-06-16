package Javaprograms_Interview;

import java.util.Scanner;

public class EvenAndOddCount {

	public static void main(String[] args) {

		// In array
		// int[] ar = { 3, 5, 2, 9, 8, 12, 6, 7 };
		// int even = 0, odd = 0;
		// for (int i = 0; i < ar.length; i++) {
		// if (ar[i] % 2 == 0) {
		// even++;
		// } else {
		// odd++;
		// }
		// }
		// System.out.println("Total even numbers - " + even + " and total odd numbers -
		// " + odd);
		// MethodThree();
		MethodTwo();
	}

	// In number // 1234 -- even 2 && odd 2
	public static void MethodTwo() {
		int e = 0, o = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		char[] ch = String.valueOf(num).toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.getNumericValue(ch[i]) % 2 == 0) {
				e++;
			} else {
				o++;
			}
		}
		System.out.println("Even - " + e + " && odd - " + o);
	}

	// In number
	public static void MethodThree() {
		int e = 0, o = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();

		// 7654

		while (num > 0) {
			int rem = 0;
			rem = num % 10;
			if (rem % 2 == 0)
				e++;
			else
				o++;
			num = num / 10;
		}
		System.out.println("Even - " + e + " && odd - " + o);
	}
}
