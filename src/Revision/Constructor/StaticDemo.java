package Revision.Constructor;

class test1
{
	int x=10;
	static int y=10;
	public
			void increment()
			{
				x++;
				y++;
			}
}
public class StaticDemo {

	public static void main(String[] args) {
		
		test1 obj1=new test1();
		test1 obj2=new test1();
		System.out.println("before x="+obj1.x+" y = "+test1.y);
		obj1.increment();
		obj2.increment();
		System.out.println("after x= "+obj1.x+" y = "+test1.y);

	}

}
