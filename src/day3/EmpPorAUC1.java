package day3;

//Employee present or abscent program
public class EmpPorAUC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isPresent = 1;
		double randomCheck = Math.floor(Math.random() * 10) % 2;

		if (isPresent == randomCheck) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is abscent");
		}
	}

}
