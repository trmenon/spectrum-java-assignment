package assignment_2_control_statements;
import java.util.Scanner;

public class Program_17_Odd_Even_Average {
	//Write a program to find average of consecutive N Odd no. and Even no
	int limit;
	//Default Constructor
	Program_17_Odd_Even_Average() {
		this.limit = 0;
	}
	//Parameterized Constructor	
	Program_17_Odd_Even_Average(int num) {
		this.limit = num;
	}
	
	//Get Limit	
	int get_limit() {
		return this.limit;
	}
	//Odd Sum
	int get_odd_sum() {
		int sum = 0;
		int count = 0;
		int i = 1;
		while(count<this.limit) {
			if(i%2 != 0) {
				sum+=i;
				count++;
//				System.out.print(i + "-");
			}
			i=i+1;
		}
//		System.out.println(count);
		return sum;
	}
	//Even Sum
	int get_even_sum() {
		int sum = 0;
		int count = 0;
		int i = 1;
		while(count<this.limit) {
			if(i%2 == 0) {
				sum+=i;
				count++;
//				System.out.print(i + "-");
			}
			i=i+1;
		}
//		System.out.println(count);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter number of terms to consider:");
		int number = scn.nextInt();
		scn.close();
		Program_17_Odd_Even_Average object = new Program_17_Odd_Even_Average(number);
		System.out.println(" Odd sum upto " + object.get_limit() + " : " + object.get_odd_sum());
		System.out.println(" Even sum upto " + object.get_limit() + " : " + object.get_even_sum());
	}

}
