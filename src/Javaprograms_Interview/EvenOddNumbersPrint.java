package Javaprograms_Interview;

import java.util.ArrayList;
import java.util.List;

public class EvenOddNumbersPrint {

	public static void main(String[] args) {

		int[] ar = {4,8,5,2,9,1,6};

		List<Integer> even = new ArrayList<>(), odd = new ArrayList<>();

		for(int i =0; i<ar.length;i++) {
			if(ar[i] %2 == 0) {
				even.add(ar[i]);
			}else {
				odd.add(ar[i]);
			}
		}
		System.out.println("Even elements in array - "+even+"\nOdd elements in array - "+odd);
	}
}
