package Revision.Array;

import java.util.Scanner;

public class DisplayElementsSingleD {
 
	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		int arr[]=new int[10];
		int n;
		System.out.println("Enter size of the Array : ");
		n=obj.nextInt();
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=obj.nextInt();
		}
		System.out.println("Display : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
