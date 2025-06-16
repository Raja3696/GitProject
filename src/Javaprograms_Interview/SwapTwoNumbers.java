package Javaprograms_Interview;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int a = 10, b = 20;
		int t = 0;
		System.out.println("Before swapping - a = " + a + " and b = " + b);
		// t = a;
		// a = b;
		// b = t;

		// Without third variable

		a = a + b; // a = 30
		b = a - b; // b = 10
		a = a - b;
		System.out.println("After swapping - a = " + a + " and b = " + b);


		//Third Way
		a = a*b;
		b = a/b;
		a = a/b;

	}
}
