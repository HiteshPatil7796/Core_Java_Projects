package InnerClasses;

class Outertwo
{
	public
	int count;
	Outertwo()
	{
		Innertwo obj=new Innertwo();
		obj.show();
	}
	class Innertwo
	{
		void show()
		{
			System.out.println("Inner class "+(++count));
		}
	}
}
public class Test {

	public static void main(String[] args) {
		
		Outertwo ot=new Outertwo();
		Outertwo.Innertwo in=ot.new Innertwo();
		//ot.display();
		in.show();

	}

}
