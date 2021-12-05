package Day5_Functional_PP;
import java.util.*;

public class Distance {

	public static void main(String args[])

	{
		int x1 = 0, x2, y1 = 0, y2;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter x2 point");

		x2 = sc.nextInt();

		System.out.println("enter y2 point");

		y2 = sc.nextInt();

		System.out.println("Distance is:" + distCalculate(x1, y1, x2, y2));

	}

	static double distCalculate(double x1, double y1, double x2, double y2) {

		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);

	}

}
