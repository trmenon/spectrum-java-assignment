package assignment_2_control_statements;
import java.util.Scanner;

public class Program_12_Multiplication_Tables {
	//Write a program to Display Multiplication Table
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start_limit = 1;
		int end_limit = 25;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number to generate multiplication tables:");
		int number = scn.nextInt();
		scn.close();
		for(int i = start_limit; i<=end_limit; i++) {
			System.out.println(i + " * " + number + " = " + (i*number));
		}
	}

}
