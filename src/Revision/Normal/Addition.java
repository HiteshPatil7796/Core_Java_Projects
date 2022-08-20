package Revision.Normal;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		int a,b;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter first number : ");
		a=obj.nextInt();
		System.out.println("Enter Second number : ");
		b=obj.nextInt();
		System.out.println("Addition of two numbers is : "+(a+b));
	}

}
