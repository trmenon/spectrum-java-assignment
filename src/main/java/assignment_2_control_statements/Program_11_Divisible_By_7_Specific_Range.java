package assignment_2_control_statements;

public class Program_11_Divisible_By_7_Specific_Range {
	/*
	 Write a program to find sum of all integers greater than 100 and less
	than 200 that are divisible by 7.	
	 */
	static int start_limit = 100;
	static int end_limit = 200;
	Boolean is_divisible_By_Seven(int num) {
		if(num%7 == 0) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program_11_Divisible_By_7_Specific_Range object = new Program_11_Divisible_By_7_Specific_Range();
		for(int i = start_limit; i<=end_limit; i++) {
			if(object.is_divisible_By_Seven(i) == true) {
				System.out.print(i);
				if(i != end_limit && (i+7)<end_limit) {
					System.out.print("->");
				}
			} 
		}
	}

}
