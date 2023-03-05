package assignment_2_control_statements;

public class Program_8_Odd_Number_Generation {
	//Write a program for Printing Odd numbers between 1 and 50
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start_range = 1;
		int end_range = 50;
		for(int i=start_range; i<=end_range; i++) {
			if(i%2 != 0) {
				System.out.print(i);
				if(i != end_range) {
					System.out.print("->");
				}
			}
		}
	}

}
