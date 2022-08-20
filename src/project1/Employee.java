package project1;

import java.util.Scanner;

class Emp
{
	private
			int Eid;
			String Ename;
			Float Esalary;
	public	
			void accept()
			{
				Scanner obj=new Scanner(System.in);
				System.out.println("Enter Employee Id : ");
				Eid=obj.nextInt();
				
				System.out.println("Enter Employee Name : ");
				Ename=obj.next();
				
				System.out.println("Enter Employee Salary : ");
				Esalary=obj.nextFloat();
			}
			void display()
			{
				System.out.println("Employee Name 	: "+Ename);
				System.out.println("Employee Id   	: "+Eid);
				System.out.println("Employee Salary : "+Esalary);
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
