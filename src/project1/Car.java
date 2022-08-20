package project1;

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
				System.out.println("Enter Model No : ");
				modelno=obj.nextInt();
				System.out.println("Enter Name : ");
				name=obj.next();
				System.out.println("Enter Price : ");
				price=obj.nextFloat();
			}
			void Display()
			{
				System.out.println("Car Name : "+name);
				System.out.println("Car model No : "+modelno);
				System.out.println("Car Price : "+price);
			}
}
public class Car {

	public static void main(String[] args) {
		
		Vehicle[] v=new Vehicle[3];
		int i;
		for(i=0;i<3;i++)
		{
			v[i]=new Vehicle();
		}
		for(i=0;i<3;i++)
		{
			v[i].accept();
		}
		for(i=0;i<3;i++)
		{
			v[i].Display();
		}

	}

}
