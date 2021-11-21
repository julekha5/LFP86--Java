package day5;
import java.util.Random;
import java.util.Scanner;

public class FlipCoin
{
	public static void main(String[] args)

	{
		int heads = 0;
        int tails = 0;
        int counter = 1;
        double randNum = 0.0;
        Scanner in = new Scanner(System.in);
         
        System.out.println("How many times will the coin be flipped? ");
        int flips = in.nextInt();
         
        while(counter <= flips)
        {
            randNum = Math.random();
            System.out.print(counter + "\t" + randNum);
             
            if(randNum < .5)
            {
                heads++;
                System.out.println("\t heads");
            }
            else
            {
                tails++;
                System.out.println("\t tails");
               }
            counter++;      
        }
        System.out.println();
        System.out.println("\n Number of Heads = " + heads);
        System.out.println("\n Number of Tails = " + tails);

	}
}	
         
/*
		int loopCount = 1;

		double result;

		int heads = 0;

		while (loopCount <= 10)

		{
			result = Math.random();

			if (result <= .5)
				System.out.println("That is heads.");
			if (result <= .5)
				heads = heads++;
			else
				System.out.println("That is tails.");

			loopCount = loopCount + 1;

		}

		float percentHeads = (float)((heads / 10 ) * 100);

		float percentTails = (float)(heads - 10 / 10  * 100);

		System.out.println("percentage of heads is: " + percentHeads);

		System.out.println("percentage of tails is: " + percentTails);
*/
			
	