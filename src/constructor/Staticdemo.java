package constructor;

class Test1
{
	static int x=100;
	int y=100;
	public
			 void incrment()
			{
				x++;
				y++;
			}
}
public class Staticdemo {

	public static void main(String[] args) {
		
		Test1 obj1=new Test1();
		Test1 obj2=new Test1();
		System.out.println(Test1.x);
		System.out.println(obj1.y);
		obj1.incrment();
		obj2.incrment();
		System.out.println(Test1.x);
		System.out.println(obj1.y);

	}

}
