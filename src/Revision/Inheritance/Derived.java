package Revision.Inheritance;

class Base
{
	public void show()
	{
		System.out.println("In Base Show ");
	}
}
public class Derived extends Base{

	public void show()
	{
		super.show();
		System.out.println("in Derived show ");
	}
	public static void main(String[] args) {
		
		Derived obj=new Derived();
		obj.show();

	}

}
