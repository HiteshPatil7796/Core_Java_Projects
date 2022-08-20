package Inheritance;

class Base
{
	public
			void display()
			{
				System.out.println("In Base Class ");
			}
}
public class Derived extends Base {
	
	public
			void display()
			{
				super.display(); // super for accessing super class of derived class 
				System.out.println(" In Derived Class ");
			}

	public static void main(String[] args) {
		
		Derived obj=new Derived();
		obj.display();

	}

}
