package Basic.Javaproject;

import java.util.Scanner;

public class ConditionCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input= new Scanner(System.in);
		
		System.out.print("Enter First number:");
		int num1=input.nextInt();
		System.out.println("First number is :" +num1);
		
		System.out.print("Enter 2nd number:");
		int num2=input.nextInt();
		System.out.println("Second number is :" +num2);
		
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
	
	}


