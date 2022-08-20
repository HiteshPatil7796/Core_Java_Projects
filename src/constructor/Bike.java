package constructor;

public class Bike {

	/*final*/ int speedlimit=90; // final keyword using with speedlimit
	public void run()
	{
		speedlimit=400;
	}
	public static void main(String[] args) {
		
		Bike obj=new Bike();
		obj.run();
		

	}

}
