package Inheritance;

class parent
{
	public
		void p1()
		{
			System.out.println(" Parent Class ");
		}
}
public class Child extends parent {
	
	public
		void c1()
		{
			System.out.println(" Child class ");
		}
	public static void main(String[] args)
	{
		
			Child obj=new Child();
			
			obj.c1();
			obj.p1();
	}

}
