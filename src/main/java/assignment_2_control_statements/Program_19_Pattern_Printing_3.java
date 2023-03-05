package assignment_2_control_statements;
import java.util.Scanner;

public class Program_19_Pattern_Printing_3 {
	/*
	 . Write a program to Display Triangle as follow
	 	0
		1 0
		0 1 0
		1 0 1 0
	 */
	static Boolean value = false;
	static int get_init(int line) {
		if(line%2 == 0) {
			value = true;
			return 0;
		}else {
			value = false;
			return 1;
		}
	}
	static int get_next() {
		value = value == false? true: false;
		return value == false? 1:0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter limit:");
		int number = scn.nextInt();
		scn.close();
		
		for(int i = 0; i<number; i++) {
			System.out.print(get_init(i) + " \t");
			for(int j=0; j<i; j++) {
				System.out.print(get_next() + " \t");
			}
			System.out.println("");
		}
	}

}
