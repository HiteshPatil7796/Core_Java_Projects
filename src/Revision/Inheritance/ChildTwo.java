package Revision.Inheritance;

class ParentTwo
{
	String name;
	public
		void show()
		{
			System.out.println("in Parent show () ");
			name="Parent";
			System.out.println("name  : "+name);
		}
}
public class ChildTwo extends ParentTwo{

	String name;
	public
		void show()
		{
			super.show();
			System.out.println("In child show()");
			name="child";
			System.out.println("Name : "+name);
		}
	public static void main(String[] args) {
		
		ChildTwo obj=new ChildTwo();
		obj.show();

	}

}
