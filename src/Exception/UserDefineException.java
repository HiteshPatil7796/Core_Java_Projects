package Exception;
class MyException extends Exception
{
	private
			int excep;
	public
			MyException(int a)
			{
				excep=a;
			}
			public String toString()
			{
				return("MyException ["+ excep +"] is less than zero");
			}
}
public class UserDefineException {

	static void sum(int a,int b) throws MyException
	{
		if(a<0)
		{
			throw new MyException(a);
		}
		else
		{
			System.out.println(a+b);
		}
	}
	public static void main(String[] args) {
		
		try
		{
			sum(-10,10);
		}
		catch(MyException e)
		{
			System.out.println("Exception Ocuured : "+e);
		}

	}

}
