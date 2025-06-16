package Motors;

import java.util.Map;
import java.util.TreeMap;

public class MapEntrypractice {

	public static void main(String[] args) {

		TreeMap<String, String> value = new TreeMap<>();
		value.put("abc", "Okati");
		value.put("ebd", "Rendu");
		value.put("cdd", "Moodu");


		for(Map.Entry<String, String> res : value.entrySet()) {
			System.out.println("Obtained is "+res.getKey()+" and "+res.getValue());
		}
	}
}
