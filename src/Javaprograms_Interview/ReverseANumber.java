package Javaprograms_Interview;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();

		// 1234 ----> 4321

		// Approach one
		// String temp = "";
		// String n = String.valueOf(num);
		// for (int i = n.length() - 1; i >= 0; i--) {
		// temp += n.charAt(i);
		// }
		// System.out.println(temp);

		// Approach two
		int tem;
		while (num > 0) {
			tem = num % 10; // 4
			System.out.print(tem);
			num = num / 10;
		}

		// Approach Three
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse - " + rev);
	}
}
