package Multithreading;

class MyThreadFour implements Runnable // we can use it by extending Thread class also
{
	public void run()
	{
		System.out.println("R1");
		try
		{
			Thread.sleep(500);// if we take negative then throw exception 
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("R2");
	}
}
public class IsaliveSleepMethod {

	public static void main(String[] args) {
		
		MyThreadFour obj=new MyThreadFour();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t1.start();
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());

	}

}
