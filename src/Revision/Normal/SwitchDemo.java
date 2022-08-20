package Revision.Normal;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		
		Scanner obj=new Scanner(System.in);
		int ch;
		do
		{
		System.out.println(" --------- Menu --------");
		System.out.println(" 	1. Swapping ");
		System.out.println(" 	2. Factorial");
		System.out.println(" 	3. EvenOdd");
		System.out.println("	4. Exit");
		System.out.println("------------------------");
		System.out.println("Enter Your Choice : ");
		ch=obj.nextInt();
		
		switch(ch)
		{
		case 1:
				System.out.println(" Swapping : ");
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
				System.out.println(" Factorial : ");
				int num,fact=1,i;
				System.out.println("Enter a Number : ");
				num=obj.nextInt();
				for(i=1;i<=num;i++)
				{
					fact=fact*i;
				}
				System.out.println("Factorial of "+num+" is : "+fact);
				break;
		case 3:
				System.out.println(" Even Odd : ");
				int number;
				System.out.println("Enter A Number : ");
				number=obj.nextInt();
				if(number%2==0)
				{
					System.out.println(" It is a Even Number ");
				}
				else
				{
					System.out.println(" It is Odd Number ");
				}
				break;
		default:
				System.out.println("Enter Correct Choice ....");
				break;
		}
		}while(ch<4);

	}

}
