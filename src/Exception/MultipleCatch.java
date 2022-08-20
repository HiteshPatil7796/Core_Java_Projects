package Exception;

public class MultipleCatch {

	public static void main(String[] args) {
		
		try
		{
			int a[]= {1,2};
			a[3]=5;//exception caught here index out of bound
			a[2]=3/0;//exception caught here arithmetic 
			System.out.println("this line doesnt execute");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Devide by Zero");
		}
		catch(ArrayIndexOutOfBoundsException arr)
		{
			System.out.println("Array Index Out Of Bound Exception");
		}

	}

}
