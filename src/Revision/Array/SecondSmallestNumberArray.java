package Revision.Array;

import java.util.Scanner;

public class SecondSmallestNumberArray {

	public static void main(String[] args) {
		
		int size;
		int []arr=new int[10];
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		size=obj.nextInt();
		System.out.println("Enter elements in an Array :  ");
		for(int i=0;i<size;i++)
		{
			arr[i]=obj.nextInt();
		}
		System.out.println("Display : ");
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+arr[i]);
		}
		
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Second Smallest Number in Array is : "+arr[1]);

	}

}
