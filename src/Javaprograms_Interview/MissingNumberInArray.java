package Javaprograms_Interview;

public class MissingNumberInArray {

	public static void main(String[] args) {

		//		Array should start with one
		//		Method One

		int[] ar = { 1, 2, 3, 4, 6 };
		int start = ar[0];
		int missNum = 0;
		int p = 0;
		int val = 0;
		boolean status = false;
		//		for (int i = 0; i < ar.length - 1; i++) {
		//			if (start + 1 == ar[i + 1] ) {
		//				start = ar[i + 1];
		//			} else {
		//				status = true;
		//				missNum = start + 1;
		//				break;
		//			}
		//		}
		//		System.out.println("Missing number in Array is "+missNum);

		//		Method Two
		while(p<ar.length) {
			val +=ar[p];
			p++;
		}
		System.out.println("Total count "+val);
		System.out.println(ar[ar.length-1]);
		while(p<ar[ar.length-1])
		{
			missNum += 1;
			p++;
		}
		System.out.println("Total count 2 "+missNum);
	}

}
