package Multithreading;

import java.beans.IntrospectionException;

class MyThreadFive extends Thread
{
	public void run()
	{
		System.out.println("R1");
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("R2");
	}
}
public class JoinMethod {

	public static void main(String[] args) {
		
		MyThreadFive t1=new MyThreadFive();
		MyThreadFive t2=new MyThreadFive();
		t1.start();
		try
		{
			t1.join();
		}
		catch(InterruptedException e)
		{}
		t2.start();

	}

}
