package Revision.Normal;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		
		int chem,bio,phy,maths,sci,sum;
		double per;
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter Physics Marks : ");
		phy=obj.nextInt();
		
		System.out.println("Enter Maths Marks : ");
		maths=obj.nextInt();
		
		System.out.println("Enter Bio Marks : ");
		bio=obj.nextInt();
		
		System.out.println("Enter chemistry Marks : ");
		chem=obj.nextInt();
		
		System.out.println("Enter Science Marks : ");
		sci=obj.nextInt();
		
		sum=phy+bio+maths+chem+sci;
		per=sum*100/500;
		
		System.out.println("Sum of all Subjects : "+sum);
		System.out.println("Percentage : "+per);
		

	}

}
