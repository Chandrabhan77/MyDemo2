// 2.Write a program to check whether year is leap year or not.

package com.test;
import java.util.Scanner;
public class Assign5_2 {
	/*public static void main(String[]args){
		int Y = 2022;
		if(Y % 4==0 && Y % 100!=0 || Y % 400==0) {
		System.out.println("Leap Year")	;
	}
	
		else
	
			System.out.println("Not Leap Year");
			}
}
*/
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entern any Year:");
		int Y = sc.nextInt();
		if(Y % 4==0 && Y % 100!=0 || Y % 400==0) {
			System.out.println("Leap Year")	;
		}
		
			else
			{
				System.out.println("Not Leap Year");
		sc.close();
				}
	}
}
	