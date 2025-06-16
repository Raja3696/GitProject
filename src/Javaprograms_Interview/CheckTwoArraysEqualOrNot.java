package Javaprograms_Interview;

import java.util.Arrays;

public class CheckTwoArraysEqualOrNot {

	public static void main(String[] args) {

		int[] ar1 = { 4, 3, 6, 7, 5, 8, 9, 1 };
		int[] ar2 = { 4, 3, 6, 7, 5, 8, 9, 1 };
		boolean flag = false;
		if (ar1.length == ar2.length) {
			for (int i = 0; i < ar1.length; i++) {
				if (ar1[i] != ar2[i])
					flag = true;
			}
			if (flag == false) {
				System.out.println("Arrays are equal");
			} else {
				System.out.println("Arrays are not equal");
			}
		} else {
			System.out.println("Arrays are not equal");
		}

		// Method 2
		boolean status = Arrays.equals(ar1, ar2);
		if (status) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}

	}
}
