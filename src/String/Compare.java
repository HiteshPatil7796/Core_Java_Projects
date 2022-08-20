package String;

public class Compare {

	public static void main(String[] args) {
		
		String s="jav";
		String s1="Java";
		String s2="Java";
		
		if(s.equals(s1)) // by using equals method
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		if(s1.equals(s2))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		String ss="java";
		String s11="java";
		String s22=new String("Java");
		if(ss==s11) // by using == operator  
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		if(s11==s22)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		
		//by compare to method 
		
		String one="Abhi";
		String two="Viraj";
		String three="Abhi";
		
		System.out.println(one.compareTo(two));
		System.out.println(two.compareTo(three));
		System.out.println(three.compareTo(one));
		
		
		
	}

}