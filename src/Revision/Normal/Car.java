package Revision.Normal;

import java.util.Scanner;

class Vehicle
{
	private
		int modelno;
		String name;
		float price;
	public
		void accept()
		{
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter model no : ");
			modelno=obj.nextInt();
			System.out.println("Enter Car Name : ");
			name=obj.next();
			System.out.println("ENter Price : ");
			price=obj.nextFloat();
		}
		void display()
		{
			System.out.println("Model no : "+modelno);
			System.out.println("Name : "+name);
			System.out.println("Price : "+price);
		}
}
public class Car {

	public static void main(String[] args) {
		
		Vehicle v[]=new Vehicle[3];
		for(int i=0;i<3;i++)
		{
			v[i]=new Vehicle();
		}
		for(int i=0;i<3;i++)
		{
			v[i].accept();
		}
		for(int i=0;i<3;i++)
		{
			v[i].display();
		}

	}

}
