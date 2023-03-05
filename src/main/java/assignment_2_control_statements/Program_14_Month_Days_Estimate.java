package assignment_2_control_statements;
import java.util.Scanner;

public class Program_14_Month_Days_Estimate {
//Write a program to convert given no. of days into months and days.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number of days:");
		int number = scn.nextInt();
		scn.close();
		System.out.println("This program works on the consideration that every month has 30 days");
		System.out.println((number/30) + " Months and " + (number%30) + " days");
	}

}
