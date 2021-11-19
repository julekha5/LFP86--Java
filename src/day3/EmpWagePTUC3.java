package day3;

//Calculate Part time Employee Wage 
public class EmpWagePTUC3 {

	public static void main(String[] args) {
		// constants
		int Is_Part_Time = 1;
		int Is_Full_Time = 2;
		int Emp_Rate_Per_Hour = 20;
		
		// variables
		int empHrs = 0;
		int empWage = 0;
		
		// computation
		double empCheck = Math.floor(Math.random() * 10) % 3;
	    
		if(empCheck == Is_Part_Time) {
			empHrs = 4;
		}
		else if(empCheck == Is_Full_Time) {
			empHrs = 8;
		} else {
			empHrs = 0;
		}
		empWage = empHrs * Emp_Rate_Per_Hour;
		System.out.println("Employee Wage:" + empWage);
	}

}
