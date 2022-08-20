package constructor;

public class emp1 {

	int eid;
	String name;
	static String C_name;
	
	static
	{
		C_name="Spark";
	}
	public
		void show()
		{
			System.out.println("eid : "+eid+" name : "+name+" C_name : "+C_name);
		}
	public static void main(String[] args) {
		
		emp1 obj=new emp1();
		obj.eid=01;
		obj.name="one";
		obj.show();
	}

}
