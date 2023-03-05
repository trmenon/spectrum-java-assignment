package assignment_2_control_statements;
import java.util.Scanner;

public class Program_18_Pattern_Printing_2 {
	/*
	 Write a program to Display Triangle as follow :
		1
		2 3
		4 5 6
		7 8 9 10 ...
	 */
	static int counter = 1;
	static int get_next() {
		return counter++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter limit:");
		int number = scn.nextInt();
		scn.close();
		
		for(int i = 0; i<number; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(get_next() + " \t");
			}
			System.out.println("");
		}
	}

}
