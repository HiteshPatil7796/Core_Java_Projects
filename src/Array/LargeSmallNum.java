package Array;

import java.util.Scanner;

public class LargeSmallNum {

	public static void main(String[] args) {
		
		int arr[]=new int[10];
		Scanner obj=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the size of array : ");
		n=obj.nextInt();
		
		System.out.println("Enter Array elements : ");
		for(i=0;i<n;i++)
		{
			arr[i]=obj.nextInt();
		}
		int min=arr[0];
		int max=arr[0];
		
		for(i=0;i<n;i++)
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
		System.out.println("Max num is : "+max);
		System.out.println("Min num is : "+min);
	}

}
