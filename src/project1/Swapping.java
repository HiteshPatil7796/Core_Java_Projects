package project1;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		
		int a,b;
		Scanner obj=new Scanner(System.in);
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
		

	}

}
