package Class;
abstract class Vehicle
{
	public
		abstract void engine();
}
public class Car extends Vehicle {

	public
		void engine()
		{
			System.out.println("Car Engine");
		}
	public static void main(String[] args) {
		
		Vehicle obj=new Car();
		obj.engine();

	}

}
