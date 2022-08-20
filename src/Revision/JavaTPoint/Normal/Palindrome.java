package Revision.JavaTPoint.Normal;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		int n,r=0,sum=0;
		System.out.println("Enter a Number : ");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		int temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+(r);
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("its a Palindrome Number ");
		}
		else
		{
			System.out.println("its not a palindrome number ");
		}
	}

}
