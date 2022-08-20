package Inheritance;

class Parenttwo
{
		String name;
	public
			void details()
			{
				name="Parent";
				System.out.println("Name : "+name);
			}
}
public class Childtwo extends Parenttwo {

	String name;
	public
		void details()
		{
			super.details();
			name="Child";
			System.out.println("Name : "+name);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childtwo obj=new Childtwo();
		obj.details();
	}

}
