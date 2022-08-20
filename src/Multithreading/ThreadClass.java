package Multithreading;

class MyThread extends Thread
{
	int i;
	public
		void run() // must method
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(" i = "+i);
			}
		}
}
public class ThreadClass {

	public static void main(String[] args) {
		
		MyThread T1=new MyThread();
		T1.start(); // must method to get threading runable state 

	}

}
