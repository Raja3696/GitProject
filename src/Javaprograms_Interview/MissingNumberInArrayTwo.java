package Javaprograms_Interview;

public class MissingNumberInArrayTwo {

	public static void main(String[] args) {

		// Given array
		/*
		 * Preconditions ||- Array must always start with elememt 1 || Array elements must be
		 * consecutive
		 */
		int[] arr = { 1, 2, 4, 5, 6 }; // 1+2+3+4+5+6 == 21 but we have 16
		int p = 0, q = 0, count = 0, res = 0, val = 0;
		int len = arr[arr.length - 1];
		while (q < arr.length) {
			count += arr[q];
			q++;
		}
		for (int i = 1; i <= len; i++) {
			val += i;
		}
		res = val - count;
		System.out.println("Missing Number is " + res);
	}

}
