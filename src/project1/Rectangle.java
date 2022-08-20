package project1;

import java.util.Scanner;

class Rect
{
	private
			int len,bredth,area;
	
	public
			void accept()
			{
				Scanner obj=new Scanner(System.in);
				System.out.println("Enter Length : ");
				len=obj.nextInt();
				System.out.println("Enter Breadth : ");
				bredth=obj.nextInt();
			}
			void calculate()
			{
				area=len*bredth;
				System.out.println("Area of Rectngle is : "+area);
			}
}

public class Rectangle {

	public static void main(String[] args) {
		
		Rect[] r=new Rect[3];
		int i;
		for(i=0;i<3;i++)
		{
			r[i]=new Rect();
		}
		for(i=0;i<3;i++)
		{
			r[i].accept();
		}
		for(i=0;i<3;i++)
		{
			r[i].calculate();
		}

	}

}
