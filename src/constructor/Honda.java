package constructor;
/*final */ class Bike1 // final class can not be extended 
{
	public
			/*final*/ void run()// final method can not be overriden 
			{
				System.out.println("Running ");
			}
}
class Honda1 extends Bike1
{
		public
			void run()
			{
				System.out.println(" Running safely with 100kmph");
			}
}
public class Honda {

	public static void main(String[] args) {
		
			Honda1 obj=new Honda1();
			obj.run();

	}

}
