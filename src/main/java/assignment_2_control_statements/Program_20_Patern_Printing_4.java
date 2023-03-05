package assignment_2_control_statements;
import java.util.Scanner;

public class Program_20_Patern_Printing_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter limit:");
		int number = scn.nextInt();
		scn.close();
		
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print((i*j) + "\t");
			}
			System.out.println("");
		}
	}

}
