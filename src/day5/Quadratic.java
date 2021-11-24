package day5.Day5_Functional_PP;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		
		double a, b, c;
		double root1, root2;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A value:");
		a = sc.nextDouble();
		System.out.println("Enter B value:");
		b = sc.nextDouble();
		System.out.println("Enter C value:");
		c = sc.nextDouble();
		
		double delta = b * b - 4 * a * c; //(b^2 - 4ac)
		
		if (delta > 0)
		{
			// two real and distinct roots
			root1 = (-b + Math.sqrt(delta)) / (2 * a);
		    root2 = (-b - Math.sqrt(delta)) / (2 * a);
		    System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
		}
		// check if delta is equal to 0
		else if (delta == 0)
		{
			// two real and equal roots
		    // delta is equal to 0
		    // so -b + 0 == -b
			root1 = root2 = -b / (2 * a);
		    System.out.format("root1 = root2 = %.2f;", root1);
		}
		// if delta is less than zero
		else
		{
			// roots are complex number and distinct
			double real = -b / (2 * a);
		    double imaginary = Math.sqrt(-delta) / (2 * a);
		    System.out.format("root1 = %.2f+%.2fi", real, imaginary);
		    System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
		}

	}

}