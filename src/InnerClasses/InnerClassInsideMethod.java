package InnerClasses;

class Outerone
{
	int count;
	void display()
	{
		for(int i=0;i<=5;i++)
		{
			class Innerone
			{
				void show()
				{
					System.out.println("Inside Inner  "+(count++));
				}
			}
			Innerone obj=new Innerone();
			obj.show();
		}
	}
}
public class InnerClassInsideMethod {

	public static void main(String[] args) {
		
		Outerone o=new Outerone();
		o.display();

	}

}
