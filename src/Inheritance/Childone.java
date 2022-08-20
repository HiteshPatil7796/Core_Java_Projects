package Inheritance;
class Parentone
{
	public
		String name;
}
public class Childone extends Parentone{

	public
		String name;
		void details()
		{
			super.name="Parent"; // super keyword for accesing variable and assigningt it 
			name="Child";
			System.out.println(super.name+" "+name);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childone obj=new Childone();
		obj.details();
	}

}
