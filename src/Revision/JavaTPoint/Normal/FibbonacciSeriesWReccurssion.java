package Revision.JavaTPoint.Normal;

import java.util.Scanner;

public class FibbonacciSeriesWReccurssion {
	static int num1=0,num2=1,fib=0,n;
	static void Fibbonacci(int n)
	{
		if(n>0)
		{
			fib=num1+num2;
			System.out.print(" "+fib);
			num1=num2;
			num2=fib;
			Fibbonacci(n-1);
		}
	}
	public static void main(String[] args) {
		
		
		System.out.println("Enter A Number : ");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		System.out.println("Fibbonnaci Series : 0 1 ");
		Fibbonacci(10);

	}

}
