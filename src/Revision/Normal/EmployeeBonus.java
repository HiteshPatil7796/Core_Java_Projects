package Revision.Normal;

import java.util.Scanner;

public class EmployeeBonus {

	public static void main(String[] args) {
		
		String name;
		int exp;
		float bonus=0;
		int salary;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Employee Name : ");
		name=obj.next();
		System.out.println("Enter Year Of Experience : ");
		exp=obj.nextInt();
		System.out.println("Enter Employee Salary : ");
		salary=obj.nextInt();
		if(exp>5)
		{
			bonus=salary*5/100;
			System.out.println("Your Bonus Amount is : "+bonus);
		}
		else
		{
			System.out.println("Sorry you are not eligible for Bonus ");
		}

	}

}
