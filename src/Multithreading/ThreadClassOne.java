package Multithreading;

import java.util.Scanner;

class MyThreadOne extends Thread
{
	int i,n;
	public
		void run()
		{
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter A Number : ");
			n=obj.nextInt();
			for(int i=1;i<=n;i++)
			{
				System.out.println(" i = "+i);
			}
		}
}
public class ThreadClassOne {

	public static void main(String[] args) {
		
		MyThreadOne T1=new MyThreadOne();
		T1.start();

	}

}
