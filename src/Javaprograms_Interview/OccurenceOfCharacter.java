package Javaprograms_Interview;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacter {

	public static void main(String[] args) {
		String str = "This is raja who is hailing from kothapeta";
		String st = str.replaceAll(" ", "");
		char[] ar = st.toCharArray();

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < ar.length; i++) {
			if (map.containsKey(ar[i])) {
				int count = map.get(ar[i]);
				map.put(ar[i], count + 1);
			} else {
				map.put(ar[i], 1);
			}
		}
		System.out.println(map);
	}
}
