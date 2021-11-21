package day6;
//Reverse Number Program
import java.util.*;

public class ReverseNumber {
	
	static int rev = 0;
	static void reverse(int n) {
		if (n <= 0)
			return;

		int rem = n % 10; // remainder
		rev = (rev * 10) + rem; 
		reverse(n / 10);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		reverse(n);
		System.out.print("Reversed Number is " + rev);
	}

}
