package day8;

import java.util.Scanner;

public class UC4 {

	public static double EqualLinesFun(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		double a, b;
		a = (double) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
		b = (double) Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2) * 1.0);

		if (String.valueOf(a).equals(String.valueOf(b))) {
			System.out.println(("Both Lines Are Equal"));
		} else {
			System.out.println("Both Lines Are Not Equal");
		}
		return 0;

	}

	public static double LineComparison(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		double a, b;
		a = (double) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
		b = (double) Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2) * 1.0);

		if (String.valueOf(a).compareTo(String.valueOf(b)) == 0) {
			System.out.println(("Both lines are equal"));
		} else if (String.valueOf(a).compareTo(String.valueOf(b)) < 0) {
			System.out.println(("Both lines are less"));
		} else if (String.valueOf(a).compareTo(String.valueOf(b)) > 0) {
			System.out.println(("Both lines are greater"));
		} else {
			System.out.println("Both are not equal");
		}

		return 0;
	}

	public static void main(String[] args) {
		int x1, y1, x2, y2, x3, y3, x4, y4;

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

		System.out.println("Using Equals Method ==>" + EqualLinesFun(x1, y1, x2, y2, x3, y3, x4, y4));
		System.out.println("Using Compare Method==>" + LineComparison(x1, y1, x2, y2, x3, y3, x4, y4));

	}

}
