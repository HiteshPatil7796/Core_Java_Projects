package Exception;

public class ThrowExample {

	static void avg()
	{
		try
		{
			throw new ArithmeticException(); // throwing exception from here 
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Caught ");
		}
	}
	public static void main(String[] args) {
		
		avg();
	}

}
