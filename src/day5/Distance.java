package day5.Day5_Functional_PP;

import java.util.Scanner;

class CalDis
{
	 double dis;
 
	 CalDis(int x1,int y1,int x2,int y2)
	 {
	  dis=(Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));

	 }
}
public class Distance {
	
	public static void main(String args[])
	
	{
	    int x1=0,x2,y1=0,y2;
	    
        float distance;
	
	    Scanner sc=new Scanner(System.in);
 
	    System.out.println("enter x2 point");
	   
            x2=sc.nextInt();
	
            System.out.println("enter y2 point");
	   
            y2=sc.nextInt();
            
     	   CalDis cd=new CalDis(x1,y1,x2,y2);	    
	 	    
      	   System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+cd.dis);

 	 	   	     
	}
	 
}
