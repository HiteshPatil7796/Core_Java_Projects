package constructor;

class Emp
{
			int eid;
			String name;
			static final String company_name="Spark";
	public
			void show()
			{
				System.out.println("Id : "+eid+" Name : "+name+" Company Name : "+company_name);
			}
}
public class ST_Employee {

	public static void main(String[] args) {
		
			Emp obj=new Emp();
			obj.eid=01;
			obj.name="one";
			obj.show();
			Emp obj1=new Emp();
			obj1.eid=02;
			obj1.name="two";
			// obj1.company_name="google"; static variablee can not be override 
			obj1.show();

	}

}
