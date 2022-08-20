package Revision.Normal;

import java.util.Scanner;

class Rect
{
	private
			int l,b,area;
	public
			void accept()
			{
				Scanner obj=new Scanner(System.in);
				
				System.out.println("Enter lenght : ");
				l=obj.nextInt();
				System.out.println("Enter Breadth : ");
				b=obj.nextInt();
			}
			void calculate()
			{
				area=l*b;
				System.out.println("Area of Rectangle is : "+area);
			}
}
public class AreaOfRectangle {

	public static void main(String[] args) {
		
		Rect  obj[]=new Rect[3];
		int i;
		for(i=0;i<=2;i++)
		{
			obj[i]=new Rect();
		}
		for(i=0;i<=2;i++)
		{
			obj[i].accept();
		}
		for(i=0;i<=2;i++)
		{
			obj[i].calculate();
		}

	}

}
