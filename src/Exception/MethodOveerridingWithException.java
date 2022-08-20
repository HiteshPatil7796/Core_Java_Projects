package Exception;

import java.io.IOException;

class Super
{
	public void show()
	{
		System.out.println("Parent class ");
	}
}
public class MethodOveerridingWithException extends Super {

	public void show() throws ArithmeticException //IOException we can not take it will give 
													// compile time error
	{
		System.out.println("Parent class in child");
	}
	public static void main(String[] args) {
		
		MethodOveerridingWithException obj=new MethodOveerridingWithException();
		obj.show();
	}

}
