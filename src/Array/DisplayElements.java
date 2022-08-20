package Array;

import java.util.Scanner;

public class DisplayElements {

	public static void main(String[] args) {
		
		int arr[]=new int[10];
		int i;
		Scanner obj=new Scanner(System.in);
		System.out.println(" Enter Size of the Array :  ");
		int n=obj.nextInt();
		System.out.println(" Enter Elements in array : ");
		for(i=0;i<n;i++)
		{
			arr[i]=obj.nextInt();
		}
		System.out.println("Display : ");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
