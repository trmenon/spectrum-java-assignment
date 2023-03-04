package assignment_1_basic_program;

import java.util.Scanner;

public class Program_5_Two_Numbers_Product {
	/*
	 Write a Java program that takes two numbers as input and display the product of
	two numbers.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number : ");
		int num2 = sc.nextInt();
		sc.close();
		System.out.println("Product of the numbers : " + (num1*num2));
	}

}
