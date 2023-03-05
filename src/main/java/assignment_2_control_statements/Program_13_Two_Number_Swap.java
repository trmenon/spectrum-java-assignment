package assignment_2_control_statements;
import java.util.Scanner;

public class Program_13_Two_Number_Swap {
	//Write a program to Swap the value of 2 variables.	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter first number:");
		int num1 = scn.nextInt();
		System.out.print("Enter second number:");
		int num2 = scn.nextInt();
		scn.close();
		System.out.println("Before swapping");
		System.out.println("First Number : " + num1);
		System.out.println("Second Number : " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After swapping");
		System.out.println("First Number : " + num1);
		System.out.println("Second Number : " + num2);
	}

}
