package Revision.Normal;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		int num,fact=1,i;
		System.out.println("Enter a Number : ");
		num=obj.nextInt();
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is : "+fact);

	}

}
