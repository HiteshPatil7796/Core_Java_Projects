package project1;

import java.util.*;

public class EvenAndOdd {

	public static void main(String[] args) {
		int num;
		Scanner obj=new Scanner(System.in);
		System.out.println(" Enter a Number : ");
		num=obj.nextInt();
		if(num%2==0)
		{
			System.out.println("Its a Even Number ");
		}
		else
		{
			System.out.println("Its a Odd Number ");
		}

	}

}
