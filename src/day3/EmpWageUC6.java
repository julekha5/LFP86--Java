package day3;

public class EmpWageUC6 {

		// constants
		public static final int Is_Part_Time = 1;
		public static final int Is_Full_Time = 2;
		public static final int Emp_Rate_Per_Hour = 20;
		public static final int NUM_OF_WORKING_DAYS = 2;
        public static final int MAX_HRS_IN_MONTH = 10;
        
		public static void main(String[] args) {
			
			// variables
			int empHrs = 0;
			int totalEmpHrs = 0;
//			int totalEmpWage = 0;
			int totalWorkingDays = 0;

			// computation
			while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
			{
				totalWorkingDays++;
			
	 		int empCheck = (int) Math.floor(Math.random() * 10) % 3;

				switch (empCheck) {
				case Is_Part_Time:
					empHrs = 4;
					break;
				case Is_Full_Time:
					empHrs = 8;
					break;

				default:
					empHrs = 0;
				}
				totalEmpHrs += empHrs;
				System.out.println("Day#:" + totalWorkingDays + "Emp Hr:" + empHrs);
			}
			int totalEmpWage = totalEmpHrs * Emp_Rate_Per_Hour;
			System.out.println("Total Employee Wage:" + totalEmpWage);
		}


	}

