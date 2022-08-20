package project1;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int ch;
		System.out.println("\n 1.Swapping ");
		System.out.println("\n 2.Even Odd ");
		System.out.println("\n 3.Factorial ");
		System.out.println("\n Enetr Your Choice : ");
		ch=obj.nextInt();
		
		switch(ch)
		{
		case 1: 
				int a,b;
				System.out.println("Enter A : ");
				a=obj.nextInt();
				System.out.println("Enter B : ");
				b=obj.nextInt();
				System.out.println(" Before Swapping A : "+a);
				System.out.println(" Before Swapping B : "+b);
				a=a+b;
				b=a-b;
				a=a-b;
				System.out.println(" After Swapping A : "+a);
				System.out.println(" After Swapping b : "+b);
				break;
		case 2: 
				int num;
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
				break;
		case 3:
				int n,i=1,factf=1,factw=1,factdw=1;
				System.out.println("Enter a Number : ");
				n=obj.nextInt();
				System.out.println("By using For Loop : ");
				for (i=1;i<=n;i++)
				{
					factf=factf*i;
				}
				System.out.println("Factorial of "+n+"is : "+factf);
				
				System.out.println("By using While Loop : ");
				i=1;
				while(i<=n)
				{
					factw=factw*i;
					i++;
				}
				System.out.println("Factorial of "+n+"is : "+factw);
				System.out.println("By using Do While Loop : ");
				i=1;
				do
				{
					factdw=factdw*i;
					i++;
				}while(i<=n);
				System.out.println("Factorial of "+n+"is : "+factdw);
		}
		

	}

}
