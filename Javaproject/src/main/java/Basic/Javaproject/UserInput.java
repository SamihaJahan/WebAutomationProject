package Basic.Javaproject;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter First number:");
		int num=input.nextInt();
		System.out.println("First number is :" +num);
		
		System.out.print("Enter 2nd number:");
		int num2=input.nextInt();
		System.out.println("Second number is :" +num2);
	}

}
