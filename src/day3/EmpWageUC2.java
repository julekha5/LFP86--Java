package day3;

//Calculate Daily Employee Wage 
public class EmpWageUC2 {

	public static void main(String[] args) {
		// constants
		int Is_Full_Time = 1;
		int Emp_Rate_Per_Hour = 20;
		
		// variables
		int empHrs = 0;
		int empWage = 0;
		
		// computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == Is_Full_Time) {
			empHrs = 8;
		} else {
			empHrs = 0;
		}
		empWage = empHrs * Emp_Rate_Per_Hour;
		System.out.println("Employee Wage:" + empWage);
	}

}
