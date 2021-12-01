package day8;
//Calculate distance between points using class method
import java.util.Scanner;

public class UC1 {
	
	public static double Distance() {
		
		int x1, x2, y1, y2;

		double dis;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter x1 point");

		x1 = sc.nextInt();

		System.out.println("enter y1 point");

		y1 = sc.nextInt();

		System.out.println("enter x2point");

		x2 = sc.nextInt();

		System.out.println("enter y2 point");

		y2 = sc.nextInt();

		dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		// dis = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);

		System.out
				.println("Distance Between Two Points" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")=" + dis);
		return dis;

	}
	
	public static void main(String[] args){ 
		Distance();
	}

}
