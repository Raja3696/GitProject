package Javaprograms_Interview;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class WriteFIle {

	public static ReadingFile rf = new ReadingFile();

	public static void main(String[] args) throws IOException{



		FileWriter fw = new FileWriter("C:\\Softwares\\Eclipse\\Projects\\eclipse-workspace\\JavaPractice\\src\\Javaprograms_Interview\\sampleOutputtext");
		BufferedWriter bw = new BufferedWriter(fw);
		String readFiletxt = rf.fileReading("C:\\Softwares\\Eclipse\\Projects\\eclipse-workspace\\JavaPractice\\src\\Javaprograms_Interview\\sampletext");
		bw.write(readFiletxt);
		//		bw.write("fghdihdn")
		System.out.println("Finished");
		bw.close();

	}
}
