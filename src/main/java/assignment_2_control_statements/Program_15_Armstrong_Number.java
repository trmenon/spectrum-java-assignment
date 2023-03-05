package assignment_2_control_statements;
import java.util.Scanner;

public class Program_15_Armstrong_Number {
	//Write a program to find whether given no. is Armstrong or not
	int getCube(int num) {
		return num*num*num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program_15_Armstrong_Number object = new Program_15_Armstrong_Number();
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a number to check if it is odd or even:");
		int number = scn.nextInt();
		scn.close();
		int clone = number;
		int sum_of_digits = 0;
		while(clone>0) {
			int temp = clone%10;
			clone /= 10;
			sum_of_digits += object.getCube(temp);
		}
//		System.out.println(sum_of_digits);
		if(sum_of_digits == number) {
			System.out.println(number + " is an armstrong number");
		}else {
			System.out.println(number + " is not an armstrong number");
		}
	}

}
