package Javaprograms_Interview;

public class SumOfElementsOfArray {

	public static void main(String[] args) {
		int[] array = { 4, 9, 2, 7 };
		// System.out.println(sumOfElementsInArray(array, array.length));
		highestLowestNumberInArray(array, array.length);

	}

	public static Integer sumOfElementsInArray(int[] ar, int len) {
		int summation = 0;
		for (int i = 0; i < len; i++) {
			summation += ar[i];
		}
		return summation;
	}

	public static void highestLowestNumberInArray(int[] ar, int len) {

		int temp = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if(ar[j] > ar[i]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println("Highest number is "+ar[0]+"\n"+"Smallest number is "+ar[len-1]);
	}
}
