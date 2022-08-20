package MethodOverloadingOverriding;

class Game
{
	public
			void type()
			{
				System.out.println("Indoor  and  Outdoor Games ");
			}
}
public class Cricket extends Game {

	public
	
		void type()
		{
			System.out.println("Outdoor Game");
		}
	public static void main(String[] args) {
		
		Game gm=new Game();
		Cricket crk=new Cricket();
		gm.type();
		crk.type();
		gm=crk;
		gm.type();

	}

}
