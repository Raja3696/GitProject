package Javaprograms_Interview;

public class ArrayAscendingOrder {

	public static void main(String[] args) {

		// Ascending Order

		int[] array = new int[] { 3, 6, 2, 7, 1, 5, 4 };
		int temp = 0;
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (Integer k : array) {
			System.out.print(k + " ");
		}
		System.out.println("Descending Order");
		// Descending Order
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (Integer k : array) {
			System.out.print(k + " ");
		}
	}

	// Approach two

	private static void sortArray(int array[], int n) {
		for (int i = 1; i < n; i++) {
			int j = i;
			int a = array[i];
			while ((j > 0) && (array[j - 1] > a)) // returns true when both conditions are true
			{
				array[j] = array[j - 1];
				j--;
			}
			array[j] = a;
		}
	}
}
