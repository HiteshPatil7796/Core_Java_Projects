package project1;

public class Test {
	
	int a=10;
	int b=20;
	
	public void callbyref(Test t)
	{
		t.a=100;
		t.b=200;
	}

	public static void main(String[] args) {
		
		Test t1=new Test();
		System.out.println("before a = "+t1.a+"b= "+t1.b);
		t1.callbyref(t1);
		System.out.println("After a= "+t1.a+"b= "+t1.b);
	}

}
