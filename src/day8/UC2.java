package day8;

import java.util.Scanner;

public class UC2 {

   public static int EqualLinesFun(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		float a, b;

		a = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
		b = (float) Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2) * 1.0);

		if ( a == b) {
			System.out.println(("Both Lines Are Equal"));
		} else {
			System.out.println("Both Lines Are Not Equal");
		}
		return 0;
}

	public static void main(String[] args) {		int x1, y1, x2, y2, x3, y3, x4, y4;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter x1, y1, x2, y2 points");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();

		System.out.println("enter x3, y3, x4, y4 points");
		x3 = sc.nextInt();
		y3 = sc.nextInt();
		x4 = sc.nextInt();
		y4 = sc.nextInt();
	
		EqualLinesFun(x1, y1, x2, y2, x3, y3, x4, y4);

	   // EqualLinesFun(5, 3, 4, 5, 7, 9, 5, 5);

	}
}
