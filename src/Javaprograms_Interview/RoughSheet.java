package Javaprograms_Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RoughSheet {

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		String[] arr = { "Raja", "Balu", "charan", "Raja", "Charan", "madan", "raja", "pani", "raja", "charan" };
		int p = 0;
		Collections.addAll(li, arr);
		//		while (p < arr.length) {
		//			li.add(arr[p]);
		//			p++;
		//		}
		System.out.println(li);
		Iterator<String> itr = li.iterator();
		int count = 0;
		while (itr.hasNext()) {

			if (itr.next().equalsIgnoreCase("Raja")) {
				itr.remove();
			}
		}
		System.out.println("New List " + li);
	}
}
