package Revision.Constructor;
class empp
{
	int id;
	String name;
	static /* final */String cname; // if we make any variable final we cann not reassigned it 
	static
	{
		cname="hello";
	}
	public
		void show()
		{
			System.out.println("id : "+id+" name : "+name+" cname : "+cname);
		}
}
public class St_Emp {

	public static void main(String[] args) {
		
		empp obj=new empp();
		obj.id=1;
		obj.name="one";
		obj.show();
		empp obj2=new empp();
		obj2.id=2;
		obj2.name="two";
		empp.cname="spark";
		obj2.show();

	}

}
