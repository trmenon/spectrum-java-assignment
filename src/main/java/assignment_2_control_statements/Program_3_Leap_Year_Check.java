package assignment_2_control_statements;
import java.util.Scanner;

public class Program_3_Leap_Year_Check {
	/*
	 Write a program to Determine If Year Is Leap Year
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the year tocheck if it is a leap year:");
		int year = scn.nextInt();
		scn.close();
		
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 == 0) {
					System.out.println(year + " is a leap year");
				}else {
					System.out.println(year + " is not a leap year");
				}
			}else {
				System.out.println(year + " is a leap year");
			}
				
		}else {
			System.out.println(year + " is not a leap year");
		}

	}

}
