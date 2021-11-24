package day5.Day5_Functional_PP;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		
		double temp, velocity;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Temperature(t) value:");
		temp = sc.nextDouble();
		System.out.println("Enter Speed(v) value:");
		velocity = sc.nextDouble();
		
        double w = 35.74 + 0.6215*temp + (0.4275*temp - 35.75) * Math.pow(velocity, 0.16);
        System.out.println("Temperature = " + temp);
        System.out.println("Wind speed  = " + velocity);
        System.out.println("Wind chill  = " + w);

	}

}