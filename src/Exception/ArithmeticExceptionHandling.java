package Exception;

public class ArithmeticExceptionHandling {

	public static void main(String[] args) {
		
		try
		{
			int a=0;
			int b=10;
			int c=b/a; // exception
			System.out.println("this line is not going to print ");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Devide by Zero ");
		}
		System.out.println("After Exception is Handled ");

	}

}
