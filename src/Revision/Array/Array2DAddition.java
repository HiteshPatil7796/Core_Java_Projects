package Revision.Array;

import java.util.Scanner;

public class Array2DAddition {
	
	public static void main(String args)
	{
		int A[][]=new int[3][3];
		int B[][]=new int[3][3];
		int C[][]=new int[3][3];
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Elements in Matrix A : ");
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				A[i][j]=obj.nextInt();
			}
		}
		
		System.out.println("Enter Elements in Matrix B : ");
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				B[i][j]=obj.nextInt();
			}
		}
		
		System.out.println("Addition of Matrix A and B is : ");
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				C[i][j]=A[i][j]+B[i][j];
				System.out.println(" "+C[i][j]);
			}
			System.out.println("");
		}
	}

}
