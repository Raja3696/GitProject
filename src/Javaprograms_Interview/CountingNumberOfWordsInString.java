package Javaprograms_Interview;

import java.util.HashMap;
import java.util.Map;

public class CountingNumberOfWordsInString {

	public static void main(String[] args) {
		String text = "This is Raja who is husband of Aroshi and Raja loves Aroshi as Aroshi is loves Raja";
		String[] ar = text.split(" ");

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < ar.length; i++) {
			if (map.containsKey(ar[i])) {
				int count = map.get(ar[i]);
				map.put(ar[i], count + 1);
			} else {
				map.put(ar[i], 1);
			}
		}

	}
}
