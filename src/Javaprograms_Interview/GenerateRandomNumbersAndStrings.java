package Javaprograms_Interview;

import java.util.Random;


public class GenerateRandomNumbersAndStrings {

	public static void main(String[] args) {

		//		Method one
		Random ran = new Random();
		int random = ran.nextInt(100);
		System.out.println(random);
		System.out.println("Math "+Math.random());

		//		Method two
		//		import org.apache.commons.lang3.RandomStringUtils
		//		String ranNumeric = RandomStringUtils.randomNumeric(3);
		//		String ranAlpha = RandomStringUtils.randomAlphabetic(10);

	}
}
