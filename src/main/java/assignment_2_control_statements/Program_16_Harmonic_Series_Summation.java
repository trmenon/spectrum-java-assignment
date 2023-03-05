package assignment_2_control_statements;

public class Program_16_Harmonic_Series_Summation {
	/*
	 Write a program to calculate the sum Harmonic Series.(1 + 1/2 + 1/3 +
		1/4 + 1/5 = 2.28 (Approximately))
	 */
	static int start_limit = 1;
	static int end_limit = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum = Float.parseFloat("0");
		for(int i = start_limit; i<=end_limit; i++) {
			sum += (float)1/i;
		}
		System.out.println(" Summation : " + sum);
	}

}
