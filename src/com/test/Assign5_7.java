// 7. Write the java program to print the square of any number.

package com.test;
import java.util.Scanner;
public class Assign5_7 {
	/*public static void main(String []args) {
		int a = 12;
	System.out.println("Square Of no: "+a*a);
			
		}
	
}
*/	
	


	
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter a Number: ");
	     num = sc.nextInt();
		sc.close();
		System.out.println("Square of Number:"+Math.pow(num,2));
	}
}