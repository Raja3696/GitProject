package ProgramsDell;

public class ArrayItems {

	public static void sumOfElementsInArray() {
		int[] arr = { 1, 2, 4, 5, 2, 4, 5 };
		int addition = 0;
		for (int array : arr) {
			addition += array;
		}
		System.out.println("Sum of elements in array is " + addition);
	}

	public static void evenNumberInArray() {
		int[] ar = { 3, 4, 5, 2, 45, 32, 44, 97 };
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				System.out.println("Its even number in array " + ar[i]);
			}
		}
	}

	public static void compareTwoArrays() {
		int[] ar1 = { 2, 5, 4, 3, 6, 7 };
		int[] ar2 = { 2, 5, 4, 3, 6, 7 };
		// Approach 1
		// if(Arrays.equals(ar1, ar2)) {
		// System.out.println("Array are equal");
		// }else {
		// System.out.println("Arrys are not equal");
		// }

		// Approach 2
		boolean value = false;
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] != ar2[i]) {
				value = true;
			}
		}
		if(value) System.out.println("Arrays are not equal");
		else System.out.println("Arrays are equal");
	}

	public static void main(String[] args) {
		// sumOfElementsInArray();
		// evenNumberInArray();
		compareTwoArrays();
	}

}
