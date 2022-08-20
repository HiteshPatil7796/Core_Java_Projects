package Revision.Class;

abstract class A
{
	public
	abstract void callme();
	void show()
	{
		System.out.println("In Abstract show ");
	}
}
public class AbstractB extends A{

	public void callme()
	{
		System.out.println("In Callme Method of Abstract Class ");
	}
	public static void main(String[] args) {
		
		AbstractB obj=new AbstractB();
		obj.show();
		obj.callme();
	}

}
