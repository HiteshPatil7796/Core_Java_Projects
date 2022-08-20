package project1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int num,i=1,factf=1,factw=1,factdw=1;
		System.out.println("Enter a Number : ");
		num=obj.nextInt();
		
		System.out.println("By using For Loop : ");
		for (i=1;i<=num;i++)
		{
			factf=factf*i;
		}
		System.out.println("Factorial of "+num+"is : "+factf);
		
		System.out.println("By using While Loop : ");
		i=1;
		while(i<=num)
		{
			factw=factw*i;
			i++;
		}
		System.out.println("Factorial of "+num+"is : "+factw);
		
		System.out.println("By using Do While Loop : ");
		i=1;
		do
		{
			factdw=factdw*i;
			i++;
		}while(i<=num);
		System.out.println("Factorial of "+num+"is : "+factdw);
	}

}
