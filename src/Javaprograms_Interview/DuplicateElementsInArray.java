package Javaprograms_Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		String[] arr = { "Raja", "charan", "Balu", "Raja" };
		List<String> li = new ArrayList<>();
		List<String> li2 = new ArrayList<>();
		Collections.addAll(li, arr);
		System.out.println(li);
		int duplicate = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j])) {
					duplicate++;
					li2.add(arr[i]);

					/*
					 * Iterator<String> itr = li.iterator(); while (itr.hasNext()) {
					 * System.out.println("ITR " + itr.next()); if
					 * (itr.next().equalsIgnoreCase(li2.get(1))) {
					 * System.out.println("Removed elemet " + itr.next()); itr.remove(); }
					 *
					 * }
					 */
				}
			}
		}
		System.out.println("Total number of Duplicates " + duplicate + " and they are - " + li);
	}
}
