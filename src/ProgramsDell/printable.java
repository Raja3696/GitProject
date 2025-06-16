package ProgramsDell;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public interface printable {

	public static void main(String[] args) throws IOException {

		URL url = new URL("https://automationqahub.com/latest-api-testing-interview-questions-and-answers/");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		String message = con.getResponseMessage();
		System.out.println(message);
	}

	void print();
}
