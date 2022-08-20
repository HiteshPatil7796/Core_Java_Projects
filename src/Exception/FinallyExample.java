package Exception;

public class FinallyExample {

	public static void main(String[] args) {
		
		
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception ");
		}
		finally
		{
			System.out.println("In Finally Block");
		}

	}

}
