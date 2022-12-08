// 5.Write a program to check whether number is even or odd.

package com.test;
import java.util.Scanner;
public class Assign5_5 {
	/*public static void main(String [] args) {
		int a = 13;
		if(a % 2==0) {
			System.out.println("number is even");
		}
			else
			{
					System.out.println("number is odd");
		}
				
		}
	}
*/


public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any number:");
	int num = sc.nextInt();
	if(num % 2== 0) {
		System.out.println(num +"  is even");
	}
	else
	{
		System.out.println(num+"  is odd");
	sc.close();
}
}
}