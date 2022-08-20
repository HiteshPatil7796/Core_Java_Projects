package Multithreading;

class A extends Thread
{
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(" i = "+i);
		}
	}
}
class B extends Thread
{
	
	public void run()
	{
		for(int J=1;J<=5;J++)
		{
			System.out.println(" J = "+J);
		}
	}
}
class C extends Thread
{
	
	public void run()
	{
		for(int k=1;k<=5;k++)
		{
			System.out.println(" K = "+k);
		}
	}
}
public class ThreadClassThree {

	public static void main(String[] args) {
		
		A a=new A();
		a.start();
		B b=new B();
		b.start();
		C c=new C();
		c.start();
		

	}

}
