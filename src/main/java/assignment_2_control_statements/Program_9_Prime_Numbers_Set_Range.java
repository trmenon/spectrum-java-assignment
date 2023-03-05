package assignment_2_control_statements;

public class Program_9_Prime_Numbers_Set_Range {
	//Write a program to generate Prime numbers between 1 and 100
	Boolean isPrime(int value) {
		Boolean status = true;
		for(int i=2;i<value;i++) {
			if(value%i == 0) {
				status = false;
			}
		}
		return status;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program_9_Prime_Numbers_Set_Range object = new Program_9_Prime_Numbers_Set_Range();
		int start_range = 3;
		int end_range = 100;
		System.out.println("[NOTE] 1 is neither a prime number nor a composite number but an unique number");
		System.out.print("1->2->");
		for(int i =start_range; i<=end_range; i++) {
//			System.out.println(object.isPrime(i));
			if(object.isPrime(i) == true) {
				System.out.print(i);
				if(i != end_range) {
					System.out.print("->");
				}
			}
		}
	}

}
