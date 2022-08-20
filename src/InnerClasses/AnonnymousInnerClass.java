package InnerClasses;
interface Animal
{
	void type();
}
public class AnonnymousInnerClass {

	public static void main(String[] args) {
		
		Animal an=new Animal()
				{
					public void type()
					{
						System.out.println("In Annonymous inner class ");
					}
				};
		an.type();

	}

}
