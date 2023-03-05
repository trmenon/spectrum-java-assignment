package assignment_2_control_statements;

import java.util.Scanner;

public class Program_1_Odd_or_Even {
	/*
	 Write a program to check whether the entered number is postive or
	negative
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number to check if it is odd or even:");
		int number = scn.nextInt();
		scn.close();
		if(number%2 == 0) {
			System.out.println(number + " is an even number");
		}
		if(number%2 != 0) {
			System.out.println(number + " is an odd number");
		}
	}

}
