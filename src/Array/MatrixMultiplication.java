package Array;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		int [][] A=new int[2][2];
		int [][] B=new int[2][2];
		int [][] C=new int[2][2];
		
		int i,j,k,r,c;
		Scanner obj=new Scanner(System.in);
//		System.out.println("Enter no of rows and cols : ");
//		r=obj.nextInt();
//		c=obj.nextInt();
		
		System.out.println("Enter Elements in Matrix A : ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				A[i][j]=obj.nextInt();
			}
		}
		
		System.out.println("Enter elements in Matrix B : ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				B[i][j]=obj.nextInt();
			}
		}
		
		System.out.println("Matrix multiplication : ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				C[i][j]=0;
				for(k=0;k<2;k++)
				{
					C[i][j]=C[i][j]+(A[i][k]*B[k][j]);
					System.out.print("\t"+C[i][j]);
				}
				System.out.println(" ");
			}
		}
	}

}
