package Javaprograms_Interview;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// Integer Palindrome
		//		try (Scanner sc = new Scanner(System.in)) {
		//			System.out.println("Enter a number : ");
		//			int num = sc.nextInt();
		//			int initialValue = num;
		//			int temp = 0;
		//			System.out.println("Numebr is " + num);
		//
		//			while (num > 0) {
		//				temp = temp * 10 + num % 10;
		//				num = num / 10;
		//			}
		//			System.out.println(temp);
		//			if (initialValue == temp) {
		//				System.out.println("Its a palindrome number");
		//			} else {
		//				System.out.println("Its not a palindrome number");
		//			}
		//		}
		palindromeString();
	}

	// String Palindrome
	public static void palindromeString() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a String value : ");
			String st = scan.nextLine();
			String orgString = st;
			String rev = "";
			for (int i = st.length() - 1; i >= 0; i--) {
				rev += st.charAt(i);
			}
			if (orgString.equalsIgnoreCase(rev))
				System.out.println("Its a palindrome String");
			else
				System.out.println("Its not a palindrome String");
		}
	}
}
