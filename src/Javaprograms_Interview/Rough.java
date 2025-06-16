package Javaprograms_Interview;

public class Rough {

	public static void main(String[] args) {

		char c = 'a';
		System.out.println(c);
		System.out.println(Character.getNumericValue(c));
		int b = c - '0';
		System.out.println(b);
		int num1 = 54;
		char cr = (char) num1;
		System.out.println("char - "+cr);

		char c1 = 'A';
		int d = Integer.parseInt(String.valueOf(Character.valueOf('p')));
		System.out.println("Pine - "+d);
		System.out.println(Character.getNumericValue(c1));
		char c2 = (char) (c+1);
		System.out.println("INte - "+c2);
	}
}
