package assignment_2_control_statements;
import java.util.Scanner;

public class Program_5_Month_Number_Estimation {
	/*
	Write a program to print the month number using SWITCH
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Month should be enetered in full upper case");
		System.out.print("Enter the month:");
		String month_string = scn.next().toString().toUpperCase();
		scn.close();
		switch(month_string) {
			case "JANUARY":
				System.out.println("First month of the year");
				break;
			case "FEBRUARY":
				System.out.println("Second month of the year");
				break;
			case "MARCH":
				System.out.println("Third month of the year");
				break;
			case "APRIL":
				System.out.println("Fourth month of the year");
				break;
			case "MAY":
				System.out.println("Fifth month of the year");
				break;
			case "JUNE":
				System.out.println("Sixth month of the year");
				break;
			case "JULY":
				System.out.println("Seventh month of the year");
				break;
			case "AUGUST":
				System.out.println("Eight month of the year");
				break;
			case "SEPTEMBER":
				System.out.println("Nonth month of the year");
				break;
			case "OCTOBER":
				System.out.println("Tenth month of the year");
				break;
			case "NOVEMBER":
				System.out.println("Eleventh month of the year");
				break;
			case "DECEMBER":
				System.out.println("Twelfth month of the year");
				break;
			default:
				System.out.println("You have entered an invalid month");
				break;
		}
	}

}
