package Javaprograms_Interview;

public class ArraySortingTwo {

	public static void main(String[] args) {

		int[] ar = {5,6,3,8,1,2};

		sortArray(ar, ar.length);
		System.out.println("After sorting Elements ");
		for(Integer k : ar) {
			System.out.print(k+" ");
		}
	}

	private static void sortArray(int array[], int n) {
		for (int i = 1; i < n; i++) {
			int j = i;
			int a = array[i];
			//			{5,6,3,8,1,2}
			while ((j > 0) && (array[j - 1] > a)) // returns true when both conditions are true
			{
				array[j] = array[j - 1];
				j--;
			}
			array[j] = a;
		}
	}
}
