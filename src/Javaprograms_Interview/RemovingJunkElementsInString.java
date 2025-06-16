package Javaprograms_Interview;

public class RemovingJunkElementsInString {

	public static void main(String[] args) {

		//		Junk Elements in string
		String s = "fshashij@jhihu$hdihd!((fdndkfdfd";

		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

		//		White spaces in string
		String s1 = "dh idufdjfidfj idufoidf dofd doifi difjiodfo   idhfoid dfd";
		s1 = s1.replaceAll("\\s", "");
		System.out.println(s1);

	}

}
