package Revision.Normal;

public class CallByValue {
	
	void callbyvalue(int a)
	{
		a=1000;
	}
	int callbyvaluee(int a)
	{
		return a=2000;
	}

	public static void main(String[] args) {
		
		CallByValue obj=new CallByValue();
		int b=500;
		obj.callbyvalue(b);
		System.out.println("value of b : "+b);
		
		
		System.out.println("value of b is : "+obj.callbyvaluee(b));

	}

}
