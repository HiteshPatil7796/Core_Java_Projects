package Multithreading;

class MyThreadThree implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(" i = "+i);
		}
	}
}
public class RunnableInterface {

	public static void main(String[] args) {
		
		MyThreadThree obj=new MyThreadThree();
		Thread T1=new Thread(obj);
		T1.start();

	}

}
