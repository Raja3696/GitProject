package Javaprograms_Interview;

import java.util.Base64;

public class Encoding {

	public static String encode(String str1, String str2) {
		return new String(Base64.getEncoder().encode((str1 + ":" + str2).getBytes()));
	}

	public static String decode(String code) {
		return new String(Base64.getDecoder().decode(code));

	}

	public static void main(String[] args) {
		String encoded = encode("Raja", "Aroshi");
		System.out.println(encoded);
		String decoded = decode(encoded);
		System.out.println(decoded);
		String[] arr = decoded.split(":");
		System.out.println("Husband is : " + arr[0] + " and Wife is : " + arr[1]);
	}
}
