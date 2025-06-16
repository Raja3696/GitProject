package Javaprograms_Interview;

public class ReverseString {

	public static void main(String[] args) {

		String str = "ABCD";

		// Method one
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("");
		// Method Two
		char[] ar = str.toCharArray();
		for (int i = ar.length - 1; i >= 0; i--) {
			System.out.print(ar[i]);
		}
		System.out.println("");
		// Method three
		StringBuffer sr = new StringBuffer(str);
		sr.reverse();
		System.out.println(sr);
	}
}
