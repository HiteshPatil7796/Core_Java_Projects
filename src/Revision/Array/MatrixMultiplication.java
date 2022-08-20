package Revision.Array;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		int [][]A=new int[3][3];
		int [][]B=new int[3][3];
		int [][]C=new int[3][3];
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Elements in Matrix A new: ");
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
		System.out.println("Multiplication of Matrix A * B : ");
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				for(int k=0;k<=2;k++)
				{
					C[i][j]=C[i][j]+(A[i][k]*B[k][j]);
					System.out.print(" "+C[i][j]);
				}
				System.out.println(" ");
			}
		}

	}

}
