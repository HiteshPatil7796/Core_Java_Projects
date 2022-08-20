package Revision.Array;

import java.util.Scanner;

public class MaxMinNumber {

	public static void main(String[] args) {
		
		int arr[]=new int[10];
		int size;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		size=obj.nextInt();
		for(int i=0;i<size;i++)
		{
			arr[i]=obj.nextInt();
		}
		System.out.println("Display : ");
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+arr[i]);
		}
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum Number of Array is : "+min);
		System.out.println("Maximum Number of Array is : "+max);
		
	}

}
