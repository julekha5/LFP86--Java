package day5;

import java.util.Scanner;

public class PowerOfTwo3 {

	public static void main(String[] args) {

		int basenumber = 2, exponent;
		long power = 1;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the exponent: ");

		exponent = sc.nextInt();

		while (exponent >= 0 && exponent < 31) {
			power *= basenumber;
			--exponent;
		}
		System.out.println(basenumber + " to the power " + exponent + " is: " + power);
	}
}
