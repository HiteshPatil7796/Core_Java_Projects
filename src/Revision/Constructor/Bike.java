package Revision.Constructor;

public class Bike {

	int speedlimit=90;
	public void run()
	{
		speedlimit=400;
		System.out.println("Speed limit is : "+speedlimit);
	}
	public static void main(String[] args) {
		
		Bike b=new Bike();
		b.run();

	}

}
