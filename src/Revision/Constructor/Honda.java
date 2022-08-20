package Revision.Constructor;

/*final*/ class Bike1 // if make final can not extend 
{
	public
		/*final*/ void run() // ifmake final can not override 
		{
			System.out.println("Bike running with 120kmph");
		}
}
class Honda1 extends Bike1
{
	public
		void run()
		{
			System.out.println("Honda1 running with 140kmph");
		}
}
public class Honda {

	public static void main(String[] args) {
		
		Honda1 obj=new  Honda1();
		obj.run();
	}

}
