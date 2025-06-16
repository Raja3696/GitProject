package Javaprograms_Interview;

import java.util.Scanner;

public class CheckingCharIsAlpha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character : ");
		String c = sc.next();
		char s = c.charAt(0);
		System.out.println("A" + Character.getNumericValue(s));
		int a = s - '0';
		System.out.println("B"+a);
		if ((s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z')) {
			System.out.println("Its Alpha character");
		} else {
			System.out.println("Its not Alpha character");
		}
	}
}
