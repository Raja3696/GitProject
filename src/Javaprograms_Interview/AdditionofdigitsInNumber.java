package Javaprograms_Interview;

import java.util.Scanner;

public class AdditionofdigitsInNumber {

	public static void main(String[] args) {

		//		Input 1234    ---  output 10

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		int sum = 0;

		while(num > 0) {
			sum = sum + num%10;
			num = num/10;
		}
		System.out.println("Total sum of digits - "+sum);
	}
}
