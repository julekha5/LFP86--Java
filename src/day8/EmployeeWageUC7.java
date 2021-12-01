package day8;

//Compute EmpWage using class methods
public class EmployeeWageUC7 {
	public static final int PT = 1;
	public static final int FT = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	public static int computeEmpWage() {

		// variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		// computation
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
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
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Employee Wage:" + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		computeEmpWage();
	}

}
