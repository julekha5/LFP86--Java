package day6;
//Perfect Number 
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args)
    {
        int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        
        if (isPerfect(n))
            System.out.println(n + " is a perfect number");
        else
            System.out.println(n + " is not a perfect number");
    }
    
    static boolean isPerfect(int n){
    	int sum = 1;
    	
    	if (n == 1)
    		return false;
    //check divisors or not	
    	for(int i=2;i<n;i++)
    	{
    		if (n % i == 0) 
    		{
            sum+=i;			
    	    }
    	}
    	
    	////sum of divisor is equal to n, then n is perfect number 
       if(sum ==n)
    	   return true;
    	
        return false; 	
    }
}

