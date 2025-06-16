package Javaprograms_Interview;

import java.util.Scanner;

public class NumberOfDigitsInNumber {

	public static void main(String[] args) {
		MethodOne
		();
	}

	public static void MethodOne() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int count = 0;
		while (num != 0) {
			count++;
			num = num / 10;
		}
		System.out.println("Total digits in number : " + count);
	}
	public static void MethodTwo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		String val = String.valueOf(sc.nextInt());
		System.out.println("Total number of digits : "+val.length());
	}
}
