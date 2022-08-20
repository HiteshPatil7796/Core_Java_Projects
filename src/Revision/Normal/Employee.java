package Revision.Normal;

import java.util.Scanner;

class Emp
{
	int id;
	String name;
	float sal;
	public
		void accept()
		{
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter Employee Id : ");
			id=obj.nextInt();
			System.out.println("Enter Employee Name : ");
			name=obj.next();
			System.out.println("Enter Employee Salary : ");
			sal=obj.nextFloat();
		}
		void display()
		{
			System.out.println("Employee id : "+id);
			System.out.println("Employee Name : "+name);
			System.out.println("Employee Salary : "+sal);
		}
}
public class Employee {

	public static void main(String[] args) {
		
		Emp e1=new Emp();
		e1.accept();
		e1.display();
		Emp e2=new Emp();
		e2.accept();
		e2.display();

	}

}
