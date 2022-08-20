package InnerClasses;

class Outer
{
	public
		void display()
		{
			System.out.println("in display of outer ");
			Inner In=new Inner();
			In.show();
		}
	class Inner
	{
		public void show()
		{
			System.out.println("in show inner ");
		}
	}
}
public class NestedClassone {

	public static void main(String[] args) {
		Outer o=new Outer();
		o.display();

	}

}
