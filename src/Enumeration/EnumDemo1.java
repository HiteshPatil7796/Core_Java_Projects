package Enumeration;

enum Student
{
	john(11),sam(10),Bella(13),viraj(9);
	public int age;
	int getage()
	{
		return age;
	}
	Student (int age)
	{
		this.age=age;
	}
}

public class EnumDemo1 {

	
	public static void main(String[] args) {
		
		Student s;
		System.out.println("Age of Viraaj is : "+Student.viraj.getage()+" years ");

	}

}
