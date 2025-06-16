import java.nio.charset.StandardCharsets;

public class RuntimePractice {

	public static void main(String[] args) {

		String st = "Raja";
		byte[] ar = st.getBytes();
		for (byte b : ar) {
			System.out.println(b);
		}
		String sr = new String(ar, StandardCharsets.ISO_8859_1);
		System.out.println(sr);

	}

}
