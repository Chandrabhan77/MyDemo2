// 8.Write a program to swap the two number.

package com.test;

public class Assign5_8 {
	
	public static void main(String [] args) {
		
		
		int first= 10,second= 20;
	    System.out.println("----Befour swap-----");
		System.out.println("First number="+ first);
		System.out.println("secound number="+ second);
		
		//value of first is  assigned to temp
		int temporary = first ;                 
				                                      
		//value of second is  assigned to temp       
		first = second;
		//value for temp is ass to second
		second = temporary;
		
		System.out.println("----after swap-----");
		System.out.println("First number="+ first);
		System.out.println("secound number="+ second);
		
		

	

}
	
}