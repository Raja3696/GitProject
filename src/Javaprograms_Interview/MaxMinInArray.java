package Javaprograms_Interview;

public class MaxMinInArray {

	public static void main(String[] args) {

		int[] arr = { 5, 3, 7, 9, 1, 11, 4 };
		int max = arr[0], min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		int k = 1;
		while (k < arr.length) {
			if (min > arr[k])
				min = arr[k];
			k++;
		}
		System.out.println("Maximum element " + max + " and Minimum elemet " + min);
	}
}
