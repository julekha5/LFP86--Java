package day5.Day5_Functional_PP;

import java.io.*;
import java.util.Scanner;

public class TwoDArray {
				 

	public static void main(String args[]) throws IOException {
     
		int m, n, i, j;   
		Scanner sc=new Scanner(System.in);   
		System.out.print("Enter the number of rows: ");   
		//taking row as input  
		m = sc.nextInt();   
		System.out.print("Enter the number of columns: ");   
		//taking column as input  
		n = sc.nextInt(); 
		
		int arr[][] = new int[m][n];  
		
		System.out.println("Enter the elements of the array: ");  
		        //loop for row  
				for (i = 0; i < m; i++) {
				//inner for loop for column  
				for (j = 0; j < n; j++) { 
					arr[i][j] = sc.nextInt();
				}
			    }
					
				// Loop through all rows
				for (i = 0; i < m; i++) {
				// Loop through all elements of current row
				System.out.println();
				for (j = 0; j < n; j++) {
				System.out.print(arr[i][j] + "\t");
					}
				}
				
	}
}
