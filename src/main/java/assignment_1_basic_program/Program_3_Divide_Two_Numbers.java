package assignment_1_basic_program;

import java.util.Scanner;

public class Program_3_Divide_Two_Numbers {
	/*
	 Write a Java program to divide two numbers and print on the scree
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Dividend(Number to be divided):");
		int num1 = sc.nextInt();
		System.out.print("Enter the Divisor:");
		int num2 = sc.nextInt();
		sc.close();
		System.out.println("Sum:"+ (num1/num2));
	}

}
