package Revision.Normal;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		int num;
		System.out.println("Enter A Number : ");
		num=obj.nextInt();
		if(num%2==0)
		{
			System.out.println(" It is a Even Number ");
		}
		else
		{
			System.out.println(" It is Odd Number ");
		}
		
	}

}
