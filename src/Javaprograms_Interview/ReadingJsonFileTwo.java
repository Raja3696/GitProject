package Javaprograms_Interview;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadingJsonFileTwo {

	public static void main(String[] args) throws IOException, ParseException, org.json.simple.parser.ParseException {
		//		URL jsonFile = ReadingJsonFileTwo.class.getClassLoader().getResource("C:/Softwares/Eclipse/Projects/eclipse-workspace/JavaPractice/sample.json");
		//		JSONParser js = new JSONParser();
		JSONParser js = new JSONParser();
		JSONObject obj = (JSONObject) js.parse(new FileReader(System.getProperty("user.dir")+"\\SampleFiles\\data.json"));
		String result = obj.toString();
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = objectMapper.readTree(result);
		JsonNode quiz = jsonNode.get("quiz");

		quiz.forEach(q-> {
			q.forEach(a-> {
				System.out.println("question: "+a.get("question"));
				System.out.println("options: "+a.get("options"));
			});
		});
	}
}
