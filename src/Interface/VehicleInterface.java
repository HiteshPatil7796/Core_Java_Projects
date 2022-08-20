package Interface;

interface Moveable
{
	int avgspeed=40;
	void move();
}
public class VehicleInterface implements Moveable {

	public void move()
	{
		System.out.println("Average Speed : "+avgspeed);
	}
	public static void main(String[] args) {
		
		VehicleInterface obj=new VehicleInterface();
		obj.move();

	}

}
