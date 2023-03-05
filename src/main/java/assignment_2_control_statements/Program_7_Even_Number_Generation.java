package assignment_2_control_statements;
import java.util.Scanner;

public class Program_7_Even_Number_Generation {
	//	Write a program to generate even Numbers
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter limit:");
		int number = scn.nextInt();
		scn.close();
		for(int i=1; i<=number; i++) {
			if(i%2 == 0) {
				System.out.print(i);
				if(i != number) {
					System.out.print("->");
				}
			}
		}
	}

}
