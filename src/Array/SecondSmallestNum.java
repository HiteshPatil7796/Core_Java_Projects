package Array;

import java.util.Scanner;

public class SecondSmallestNum {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a[]=new int[20];
		int i,n,j,temp;
		System.out.println("Enter the no of array : ");
		n=obj.nextInt();
		System.out.println("Enter array elements : ");
		for(i=0;i<n;i++)
		{
			a[i]=obj.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(" Second Smallest No is : "+a[1]);

	}

}
