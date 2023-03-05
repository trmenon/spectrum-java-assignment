package assignment_2_control_statements;
import java.util.Scanner;

public class Program_2_Number_Comparison {
	/*
	 .Write a program to Compare Two Numbers
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the first number:");
		Double number1 = scn.nextDouble();
		System.out.print("Enter the second number:");
		Double number2 = scn.nextDouble();
		scn.close();
		if(number1.doubleValue() == number2.doubleValue()) {
			System.out.println(number1 + " and " + number2 + " are equal");
		}else {
			if(number1.doubleValue()<number2.doubleValue()) {
				System.out.println(number1 + " is " + " lesser than " + number2);
			}else {
				System.out.println(number1 + " is " + " greater than " + number2);
			}
		}
	}

}
