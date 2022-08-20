package project1;

import java.util.*;

public class Percentage {

	public static void main(String[] args) {
		
		int sum,phy,bio,chem,maths,sci;
		float per;
		Scanner obj=new Scanner(System.in);
		System.out.println(" Enter Physics Marks : ");
		phy=obj.nextInt();
		System.out.println(" Enter Bio Marks : ");
		bio=obj.nextInt();
		System.out.println(" Enter Chemistry Marks : ");
		chem=obj.nextInt();
		System.out.println(" Enter Maths Marks : ");
		maths=obj.nextInt();
		System.out.println(" Enter Science Marks : ");
		sci=obj.nextInt();
		sum=phy+bio+chem+maths+sci;
		per=sum*100/500;
		System.out.println(" Sum = "+sum);
		System.out.println(" Percentage  = "+per);
	}

}
