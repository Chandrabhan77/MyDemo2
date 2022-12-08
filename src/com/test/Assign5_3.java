// 3. Write a program to find out maximum number among three 
//    three number (if else if ladder statement).

package com.test;

public class Assign5_3 {
	public static void main(String [] args) {
		int a =7, b =10, c=20;
	    if (a>=b && a>=c)
	    {
	    	System.out.println("largest number is:" +a);
	    }
	    else
	    	if (b>=a && b>=c)
	    	{
	    System.out.println("largest number is:" +b);
	    	}
	    else
	    {
	    	System.out.println("largest number is:" +c);
	
	}
}
}