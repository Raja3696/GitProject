package Javaprograms_Interview;

public class ReverseEachWordInString {

	public static void main(String[] args) {

		String str = "This is Raja";
		String[] arr = str.split(" ");
		String main = "";

		for (int i = arr.length-1; i >= 0; i--) {
			String word = arr[i];
			String temp = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				temp += word.charAt(j);
			}
			main += temp + " ";
		}
		System.out.println(main);
	}
}
