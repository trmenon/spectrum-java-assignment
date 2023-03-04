package assignment_1_basic_program;
import java.util.Scanner;

public class Program_6_Arithmetic_Two_Numbers {
	/*
	 Write a Java program to print the sum (addition), multiply, subtract, divide and
	remainder of two numbers.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number : ");
		int num2 = sc.nextInt();
		sc.close();
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		System.out.println(num1 + " mod " + num2 + " = " + (num1%num2));
	}

}
