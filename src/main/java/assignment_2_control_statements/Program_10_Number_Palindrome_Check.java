package assignment_2_control_statements;
import java.util.Scanner;

public class Program_10_Number_Palindrome_Check {
	//Write a program to Check if a number is Palindrome Number	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number to check if it is a palindrome:");
		Long number = scn.nextLong();
		Long clone = number;
		scn.close();
		Long number_reverse = Long.parseLong("0");
		while(clone>0) {
			number_reverse = (number_reverse*10) + (clone%10);
			clone = clone/10;
		}
		if(number_reverse.longValue() == number.longValue()) {
			System.out.println(number + " is a palindrome");
		}else {
			System.out.println(number + " is not a palindrome");
		}
	}

}
