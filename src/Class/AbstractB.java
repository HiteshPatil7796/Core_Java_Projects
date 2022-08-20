package Class;

abstract class A
{
	abstract void callme();
	void normal()
	{
		System.out.println("in normal method");
	}
}
public class AbstractB extends A{
	
	void callme()
	{
		System.out.println("This is callme function ");
	}

	public static void main(String[] args) {

		AbstractB obj=new AbstractB();
		obj.callme();
		obj.normal();

	}

}
