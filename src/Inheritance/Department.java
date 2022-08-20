package Inheritance;

class Employee
{
	int id;
	String name;

	public
		Employee(int i,String n)
		{
			this.id=i;
			this.name=n;
		}
		
}

public class Department extends Employee {

	String designation;
	double salary;
	
	public
		Department(int i,String n, String d, double s)
		{
			super(i,n);
			this.designation=d;
			this.salary=s;
		}
	
		void display()
		{
			System.out.println("Employee name 	: "+name);
			System.out.println("Employee Id  	: "+id);
			System.out.println("Employee Designation : "+designation);
			System.out.println("Employee Salary : "+salary);
		}
	public static void main(String[] args) {
		Department obj=new Department(01,"One","Officer",25000);
		obj.display();
	}

}
