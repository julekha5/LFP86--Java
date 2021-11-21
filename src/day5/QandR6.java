package day5;

import java.util.Scanner;

class QandR6 {

	public static void main(String[] args) {
		System.out.println("Enter the value of dividend and divisor");
		Scanner sc = new Scanner(System.in);
		int dividend = sc.nextInt();
		int divisor = sc.nextInt();
		int q = 0, rem = 0;

		q = dividend / divisor;

		rem = dividend % divisor;

		System.out.println("Quotient when " + dividend + "/" + divisor + " is: " + q);
		System.out.println("Remainder when " + dividend + " is divided by " + divisor + " is: " + rem);
	}
}
