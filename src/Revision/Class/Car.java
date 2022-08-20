package Revision.Class;

abstract class Vehicle
{
	public
		abstract void engine();
}
public class Car extends Vehicle{

	public void engine()
	{
		System.out.println("In Car Engine ");
	}
	public static void main(String[] args) {
		
		Vehicle obj=new Car();
		obj.engine();

	}

}
