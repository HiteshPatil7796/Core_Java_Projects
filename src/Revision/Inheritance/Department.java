package Revision.Inheritance;

class Employee
{
	int id;
	String name;
	public
		Employee(int id,String  name)
		{
			this.id=id;
			this.name=name;
		}
}
public class Department extends Employee{

	String Designation;
	int salary;
	public Department(int id,String name,String Designation,int salary)
	{
		super(id,name);
		this.Designation=Designation;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Employee Id : "+id);
		System.out.println("Emp;oyee Name : "+name);
		System.out.println("Employee Designation : "+Designation);
		System.out.println("Employee Salary : "+salary);
	}
	public static void main(String[] args) {
		
		Department obj=new Department(1,"Hitesh","CEO",1000000);
		obj.display();

	}

}
