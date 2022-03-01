package Basic.Javaproject;

import java.util.Scanner;

public class Method {

	public static int addition (int num1, int num2)
	{
	
		int sum=num1+num2;
		System.out.println("SUM is :" +sum);
		
		return sum;
	}
	
	
	//check
	public static void check(int num1, int num2)
	{
	
	if(num1 == num2)
	{
		System.out.println("Numbers are same");
		
	}
	else if (num1>num2)
	{
		System.out.println("Number 1 is greater than number 2");
		
	}
	
	
	else
	{
		System.out.println("Number 2 is greater than number 1");
		
	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First number:");
		int number1=input.nextInt();
		System.out.println("First number is :" +number1);
		
		System.out.print("Enter 2nd number:");
		int number2=input.nextInt();
		System.out.println("Second number is :" +number2);
		
		addition(number1,number2);
		check(number1,number2);
	}

	}


