package Exception;

public class ThrowsDemo {

	static void check() throws ArithmeticException
	{
		System.out.println("Inside check function ");
		int a=10,b=0;
		int c=a/b;// throws excception 
		System.out.println(c);
		//throw new ArithmeticException(); //it will also work 
	}

	public static void main(String[] args) throws ArithmeticException {
		
		try
		{
			check();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught  "+e);
		}
		System.out.println("After Execution");
		

	}

}
