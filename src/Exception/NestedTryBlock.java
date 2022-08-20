package Exception;

public class NestedTryBlock {

	public static void main(String[] args) {
		
		
		try
		{
			int arr[]= {5,0,3,4};
			try
			{
				int x=arr[3]/arr[1]; // Arithmetic exception occurs here
			}
			catch(ArithmeticException e)
			{
				System.out.println("Devide By zero ");
			}
			arr[5]=3; // index exception occurs here 
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Array Index Out Of Bound Exception");
		}

	}

}
