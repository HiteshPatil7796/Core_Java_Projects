package Revision.JavaTPoint.Normal;

import java.util.Scanner;

public class FibonacciSeriesWORecurssion {

	public static void main(String[] args) {
		
		int num1=0,num2=1,fib=0,n;
		System.out.println("Enter A Number : ");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		System.out.println("Fibonacci Series : 0 1 ");
		for(int i=1;i<=n;i++)
		{
			fib=num1+num2;
			num1=num2;
			num2=fib;
			System.out.print(+fib+" ");
		}
	}

}
