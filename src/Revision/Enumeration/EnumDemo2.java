package Revision.Enumeration;

enum Student
{
	one(21),two(22),three(23),four(24);
	public int age;
	int getAge()
	{
		return age;
	}
	Student(int age)
	{
		this.age=age;
	}
	
}
public class EnumDemo2 {

	public static void main(String[] args) {
		
		System.out.println("Age of two is "+Student.two.getAge()+" years");

	}

}
