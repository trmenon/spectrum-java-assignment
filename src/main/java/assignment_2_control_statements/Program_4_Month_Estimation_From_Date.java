package assignment_2_control_statements;
import java.util.Scanner;

public class Program_4_Month_Estimation_From_Date {
	/*
	 Write a program to determine the month by using Switch Case
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Date must be enetered in (DD-MM-YYYY) Format to get accurate results");
		System.out.print("Enter the date:");
		String date_string = scn.next().toString();
		scn.close();
		String[] date_list = date_string.split("-");
		if(date_list.length== 3) {
//			Validated number of date parameters
			int month_number = Integer.parseInt(date_list[1]);
			if(month_number > 0 && month_number<13) {
				switch(month_number) {
					case 1: {
						System.out.println("Month : January");
						break;
					}
					case 2: {
						System.out.println("Month : February");
						break;
					}
					case 3: {
						System.out.println("Month : March");
						break;
					}
					case 4: {
						System.out.println("Month : April");
						break;
					}
					case 5: {
						System.out.println("Month : May");
						break;
					}
					case 6: {
						System.out.println("Month : June");
						break;
					}
					case 7: {
						System.out.println("Month : July");
						break;
					}
					case 8: {
						System.out.println("Month : August");
						break;
					}
					case 9: {
						System.out.println("Month : September");
						break;
					}
					case 10: {
						System.out.println("Month : October");
						break;
					}
					case 11: {
						System.out.println("Month : November");
						break;
					}
					case 12: {
						System.out.println("Month : December");
						break;
					}
					default: {
						System.out.println("[Terminating] Invalid month. There are only 12 months in a year. Enter date in the required format");
						break;
					}
				}
			}else {
				System.out.println("[Terminating] Invalid month. There are only 12 months in a year. Enter date in the required format");
			}
		}else {
			System.out.println("[Terminating] Enter date in the required format");
		}
	}

}
