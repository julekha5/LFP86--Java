package day9;

import java.util.Scanner;

public class EmployeeWageUC8 {

	public static final int PT = 1;
	public static final int FT = 2;

	public static int computeEmpWage(String company_name, int numOfWorkingDays, int empRatePH, int maxHrsPerMonth) {

		// variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		// computation
		while (totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;

			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (empCheck) {
			case PT:
				empHrs = 4;
				break;
			case FT:
				empHrs = 8;
				break;

			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#:" + totalWorkingDays + "" + "Emp Hr:" + empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePH;
		System.out.println("Total Employee Wage:" + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
//		String cname = null;
//		int wdays =0 ,emprate=0,maxhr = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Company name");
//		sc.next();
//		System.out.println("Enter Number of Working Days");
//		sc.nextInt();
//		System.out.println("Enter Employee Rate Per Hour");
//		sc.nextInt();
//		System.out.println("Enter Maximum Hour Per Month");
//		sc.nextInt();
//		computeEmpWage(cname, wdays, emprate, maxhr);

		computeEmpWage("TCS", 10, 100, 50);

	}

}
