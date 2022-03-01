package Basic.Javaproject;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner input= new Scanner(System.in);
		
		System.out.print("Enter First number:");
		int num1=input.nextInt();
		System.out.println("First number is :" +num1);
		
		System.out.print("Enter 2nd number:");
		int num2=input.nextInt();
		System.out.println("Second number is :" +num2);
		
		int sum=num1+num2;
		int mul=num1*num2;
		
		System.out.println("The sum is :" +sum);
		System.out.println("The multiplication is :" +mul);
	}

}
