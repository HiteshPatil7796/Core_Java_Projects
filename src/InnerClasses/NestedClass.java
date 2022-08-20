package InnerClasses;

class A
{
	int i;
	class B
	{
		int j;
		
	}
}
public class NestedClass {

	public static void main(String[] args) {
		
		A obj1=new A();
		obj1.i=5;
		System.out.println("i : "+obj1.i);
		A.B obj2=obj1.new B();
		obj2.j=15;
		System.out.println("j : "+obj2.j);

	}

}
