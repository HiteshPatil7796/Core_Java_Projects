package Revision.Constructor;

public class Emp1 {

	int eid;
	String ename;
	static String c_name;
	static
	{
		c_name="Spark";
	}
	public
		void show()
		{
			System.out.println("Emp id : "+eid+" Emp name : "+ename+" Company Name :"+c_name);
		}
		
	public static void main(String[] args) {
		
		Emp1 obj=new Emp1();
		obj.eid=1;
		obj.ename="one";
		obj.show();

	}

}
