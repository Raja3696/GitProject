package practice;

import java.util.Scanner;

public class puzzle {

	//	public static void main(String[] args) {
	//		int a = 0, b = 0, n = 0;
	//		int obVal = 0;
	//		int val = 1;
	//		Scanner sc = new Scanner(System.in);
	//		a = sc.nextInt();
	//		b = sc.nextInt();
	//		n = sc.nextInt();
	//
	//		for (int j = 1; j <= n; j++) {
	//			if (j > 1) {
	//				for (int i = 1; i <= j; i++) {
	//					val = val * 2;
	//				}
	//				val = val - 1;
	//			}
	//			obVal = a + val * b;
	//			System.out.print(obVal + " ");
	//			val = 1;
	//
	//		}
	//		sc.close();
	//	}
	public static void main(String[] argh) {
		int val = 0;
		int obVal = 0;
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int k = 0; k < t; k++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			for (int j = 1; j <= n; j++) {
				if (j > 1) {
					for (int i = 1; i <= j; i++) {
						val = val * 2;
					}
					val = val - 1;
				}
				obVal = a + val * b;
				System.out.print(obVal + " ");
				val = 1;
			}
		}

		in.close();
	}
}