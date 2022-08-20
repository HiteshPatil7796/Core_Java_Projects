package project1;

import java.util.Scanner;

public class ATMTransaction {

	public static void main(String[] args) {
		
		int ch,damount,bal=5000,wamount;
		Scanner obj=new Scanner(System.in);
		System.out.println("	 Welcome to ATM ");
		System.out.println(" 1. Deposit Amount ");
		System.out.println(" 2. Withdrawl Amount ");
		System.out.println(" 3. Bank Balance ");
		System.out.println("\n Enter Your Choice : ");
		ch=obj.nextInt();
		
		switch(ch)
		{
		case 1:
				System.out.println("Enter Amount : ");
				damount=obj.nextInt();
				bal=bal+damount;
				System.out.println("\n "+damount+" Successfully Deposited ");
				System.out.println(" New Bank Balance is : "+bal);
				break;
		case 2:
				System.out.println("Enter Amount : ");
				wamount=obj.nextInt();
				bal=bal-wamount;
				System.out.println(" "+wamount+" Successfully Withdrawl ");
				System.out.println(" New Bank Balance is : "+bal);
				break;
		case 3:
				System.out.println("Bank Balance : "+bal);
				break;
		default:
				System.out.println(" Enter Correct Choice . . . .");	
		}

	}

}
