package day5;

import java.util.Scanner;
import java.lang.*;

//Java Program to Generate Harmonic Series

public class Harmonic {

	// this is a main function
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number: ");

		int num = sc.nextInt();
		double result = 0.0;

		System.out.println("The harmonic series is: ");

		for (int i = num; i > 0; i--) {

			// calculating harmonic values
			result = result + (double) 1 / i;

			System.out.print(+result);
		}
	}
}
