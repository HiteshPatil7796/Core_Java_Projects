package Multithreading;

class Pen{}
class Paper{}
public class DeadLock {

	public static void main(String[] args) {
		
		final Pen pn=new Pen();
		final Paper pr=new Paper();
		Thread t1=new Thread()
				{
					public void run()
					{
						synchronized(pn)
						{
							System.out.println("Thread one is holding pen");
							try
							{
								Thread.sleep(1000);
							}
							catch(InterruptedException e)
							{
								
							}
							synchronized(pr)
							{
								System.out.println("Requesting for Paper");
							}
						}
					}
				};
		Thread t2=new Thread()
				{
					public void run()
					{
						synchronized(pr)
						{
							System.out.println("Thread two is holding paper ");
						}
						try
						{
							Thread.sleep(1000);
						}
						catch(InterruptedException e)
						{
							
						}
						synchronized(pn)
						{
							System.out.println("Requesting For Pen");
						}
					}
				};
		t1.start();
		t2.start();

	}

}
