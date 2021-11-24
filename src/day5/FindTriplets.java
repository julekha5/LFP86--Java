package day5.Day5_Functional_PP;

import java.util.Scanner;

public class FindTriplets {
	// Prints all triplets in arr[] with 0 sum
	static void FindTr(int[] arr, int n) {
		boolean found = true;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println("Found 3 elements whose sum is = 0");
						System.out.println("Elements are :" + arr[i] + " " + arr[j]+ " " + arr[k]);

						found = true;
					}
				}
			}
		}

		// If no triplet with 0 sum found in array
		if (found == false)
			System.out.println(" not exist ");

	}
	public static void main(String[] args){
	
    int arr[] = {2,3,-2,5,0};
    int n = arr.length;

	    FindTr(arr, n);
	}

}
