package Revision.Inheritance;

class ParentOne
{
	String name;
}
public class ChildOne extends ParentOne {

	String name;
	public void show()
	{
		super.name="ParentOne";
		name="ChildOne";
		System.out.println(super.name+" "+name);
	}
	public static void main(String[] args) {
		
		ChildOne obj=new ChildOne();
		obj.show();

	}

}
