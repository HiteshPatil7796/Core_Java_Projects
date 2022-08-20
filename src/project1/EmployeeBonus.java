package project1;

import java.util.Scanner;

public class EmployeeBonus {

	public static void main(String[] args) {
		
		int salary,yoe,bonus;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Your Salary : ");
		salary=obj.nextInt();
		System.out.println("Enter Year Of Experience : ");
		yoe=obj.nextInt();
		
		if(yoe>5)
		{
			bonus=salary*5/100;
			System.out.println("Your Bonus Amount : "+bonus);
		}
		else
		{
			System.out.println("Sorry You are not eligible for bonus ");
		}
	}

}
