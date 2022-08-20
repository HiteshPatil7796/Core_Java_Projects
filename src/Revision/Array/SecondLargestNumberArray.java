package Revision.Array;

import java.util.Scanner;

public class SecondLargestNumberArray {

	public static void main(String[] args) {
		
		int arr[]=new int[10];
		Scanner obj=new Scanner(System.in);
		int size;
		System.out.println("Enter Size of the Array : ");
		size=obj.nextInt();
		System.out.println("Enter Elements : ");
		for(int i=0;i<size;i++)
		{
			arr[i]=obj.nextInt();
		}
		System.out.println(" Display : ");
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+arr[i]);
		}
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("second larrgest no in array is : "+arr[1]);
	}

}
