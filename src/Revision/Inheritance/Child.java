package Revision.Inheritance;

class Parent
{
	public void p1()
	{
		System.out.println("In p1");
	}
}
public class Child extends Parent {
	
	public void c1()
	{
		System.out.println("In c1");
	}
	public static void main(String[] args) {
		
		Child obj=new Child();
		obj.c1();
		obj.p1();

	}

}
