package Javaprograms_Interview;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {

		//		 input 5 ----> o/p --> 5*4*3*2*1

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :" );
		int num = sc.nextInt();
		int factorial = 1;

		for(int i = num; i>0; i--) {
			factorial *= i;
		}
		System.out.println("Factorial of "+num+" is - "+factorial);
	}
}
