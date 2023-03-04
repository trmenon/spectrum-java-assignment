package assignment_1_basic_program;

import java.util.Scanner;

public class Program_1_Hello_Name {
/*	Write a Java program to print 'Hello' on screen and then print your name on a
	separate line.
*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter your name:");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		scanner.close();
		System.out.println("Hello");
		System.out.println(name);
	}

}
