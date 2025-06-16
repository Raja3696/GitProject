package Javaprograms_Interview;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jayway.jsonpath.JsonPath;

public class ReadingJson {

	public static JSONParser js = new JSONParser();

	public void storingJsonElementsInArray() {
		try {
			JSONObject obj = (JSONObject) js
					.parse(new FileReader(System.getProperty("user.dir") + "\\SampleFiles\\data.json"));
			JSONObject jobj = (JSONObject) obj.get("QA");

			String str = JsonPath.read(obj, "$.QA.users[0].password");
			System.out.println("Object " + str);
			System.out.println(jobj);
			JSONArray jar = (JSONArray) jobj.get("users");
			System.out.println(jar);
			Iterator itr = jar.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}

		} catch (Exception e) {
			System.out.println("Cannot able to fetch the value");
		}
	}

	public static void ReadingLocalJsonElements() throws FileNotFoundException, IOException, ParseException {
		JSONObject obj = (JSONObject) js.parse(new FileReader(System.getProperty("user.dir")+"\\SampleFiles\\data.json"));
		String result = obj.toString();
		String qshn = com.jayway.jsonpath.JsonPath.read(result, "$.quiz.maths.q1.question");
		System.out.println("Quiz ---- "+qshn);
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		ReadingLocalJsonElements();
	}
}
