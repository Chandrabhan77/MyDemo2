// 1.Write a program to check the number is positive or negative.

package com.test;
import java.util.Scanner;
public class Assign5 {
	/*public static void main(String [] args)
	{
		int a = 0;
		if (a>=0) {
			System.out.println("The Number is positive");
		}
		else
		     if(a=<0)
		{   
			System.out.println("The Number is negative");
		}
	     
	    
			}
}*/
	
	
   public static void main(String [] args)
   {
	   int num;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a number:");
	   num = sc.nextInt();
	   {
		 if(num>=0)
		 {
		 System.out.println("Number is Positive:");
			  }
	   else if(num<=0)
	   {
		   System.out.println("Number is Negative:");
	   }
	   else
	   {
		 System.out.println("The is Zero");
		 sc.close();
	   }
	   }
   }
}
   