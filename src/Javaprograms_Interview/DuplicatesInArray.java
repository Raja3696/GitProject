package Javaprograms_Interview;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {

		String[] st = { "Raja", "balu", "charan", "Raja", "balu" };
		Set<String> set = new HashSet<>();
		for (int i = 0; i < st.length; i++) {
			for (int j = i + 1; j < st.length; j++) {
				if (st[i].equalsIgnoreCase(st[j])) {
					set.add(st[i]);

				}
			}
		}
		System.out.println("Total number of Duplicates " + set.size() + " and they are - " + set);
	}
}
