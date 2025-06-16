package Javaprograms_Interview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args) throws IOException {
		
		fileReading("C:\\Softwares\\Eclipse\\Projects\\eclipse-workspace\\JavaPractice\\src\\Javaprograms_Interview\\sampletext");
		// Commented code is to write to file
		// FileOutputStream fos = new
		// FileOutputStream("C:\\Softwares\\Eclipse\\Projects\\eclipse-workspace\\JavaPractice\\src\\Javaprograms_Interview\\sampleOutputtext");

		// byte[] ar = str.getBytes();
		// fos.write(ar);

	}

	public static String fileReading(String p) throws IOException {
		FileReader fr = new FileReader(p);
		BufferedReader br = new BufferedReader(fr);
		String str;
		String mainStr = null;
		while ((str = br.readLine()) != null) {
			mainStr += str;
		}
		return mainStr;
	}
}
