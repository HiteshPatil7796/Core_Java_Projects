package Revision.Normal;

public class TestCallByRef {

	int a=10,b=20;
	
		public void callbyref(TestCallByRef t)
		{
			t.a=100;
			t.b=200;
		}
	
	public static void main(String[] args) {
		
		TestCallByRef obj=new TestCallByRef();
		System.out.println("Before a="+obj.a+" b= "+obj.b);
		obj.callbyref(obj);
		System.out.println("After  a="+obj.a+" b= "+obj.b);

	}

}
