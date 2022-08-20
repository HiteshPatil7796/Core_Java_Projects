package Revision.JavaTPoint.Normal;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int n,fact=1,i;
		System.out.println("Enter a Number : ");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is : "+fact);
	}

}
