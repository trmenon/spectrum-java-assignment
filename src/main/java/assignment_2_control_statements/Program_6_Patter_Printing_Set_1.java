package assignment_2_control_statements;

import java.util.Scanner;

public class Program_6_Patter_Printing_Set_1 {
	/*
	 Pattern printing	 
	 */
	void pattern_one() {
		int limit = 6;
		for(int i=0; i<limit; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	void pattern_two() {
		int limit = 6;
		for(int i =limit; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	void pattern_three() {
		int limit = 5;
		for(int i=0; i<limit; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i =limit; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	void pattern_four() {
		int limit = 5;
		for(int i=0; i<limit; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print(j+1);
			}
			System.out.println("");
		}
	}
	void pattern_five() {
		int limit = 5;
		for(int i =limit; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print(j+1);
			}
			System.out.println("");
		}
	}
	void pattern_six() {
		int inc_limit = 3;
		int dec_limit = 5;
		for(int i =dec_limit; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=0; i<inc_limit; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program_6_Patter_Printing_Set_1 object = new Program_6_Patter_Printing_Set_1();
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter choice of pattern(1-6):");
		int choice = scn.nextInt();
		scn.close();
		switch(choice) {
			case 1:
				object.pattern_one();
				break;
			case 2:
				object.pattern_two();
				break;
			case 3:
				object.pattern_three();
				break;
			case 4:
				object.pattern_four();
				break;
			case 5:
				object.pattern_five();
				break;
			case 6:
				object.pattern_six();
				break;
			default:
				System.out.println("[TERMINATING] Invalid choice of operation");
		}
	}

}
