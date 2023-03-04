package assignment_1_basic_program;
import java.util.Scanner;

public class Program_7_Multiplication_Table {
	/*
	 Write a Java program that takes a number as input and prints its multiplication
		table up to 10
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to generate multiplication tables : ");
		int num = sc.nextInt();
		sc.close();
		for(int count = 1; count <= 10; count++) {
			System.out.println(count + " * " + num + " = " + (num*count));
		}
	}

}
