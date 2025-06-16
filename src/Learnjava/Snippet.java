package Learnjava;

import java.util.Arrays;
import java.util.List;

public class Snippet {

	public static void main(String[] args) {
		//		Int array to list
		int[] array = {21,45,7,88,4,6,9,41};

		List<Integer> list = Arrays.stream(array).boxed().toList();
		System.out.println(list);
	}
}

