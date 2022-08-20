package Revision.Interface;

interface Moveablee
{
	int avgspeed=40;
	void move();
}
public class VehicleInterface implements Moveablee {

	public void move()
	{
		System.out.println("Average speed is : "+avgspeed);
	}
	public static void main(String[] args) {
		
		VehicleInterface obj=new VehicleInterface();
		obj.move();
	}

}
