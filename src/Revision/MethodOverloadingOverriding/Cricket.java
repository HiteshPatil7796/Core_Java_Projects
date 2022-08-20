package Revision.MethodOverloadingOverriding;

class Game
{
	public
		void type()
		{
			System.out.println("Indoor and Outdoor Games");
		}
}
public class Cricket extends Game{

	public void type()
	{
		System.out.println("Cricket is Outdoor Game ");
	}
	public static void main(String[] args) {
		
		Game gm=new Game();
		gm.type();
		Cricket crk=new Cricket();
		crk.type();
		gm=crk;
		gm.type();

	}

}
