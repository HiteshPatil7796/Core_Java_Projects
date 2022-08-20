package constructor;

public class StaticC {
	
	
	public static void sq(int x)
	{
		System.out.println(x*x);
	}
	static int x=100;
	public static void main(String[] args) { // static method can access only static variable 
		
		sq(7);

	}

}
