package String;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer obj=new StringBuffer("Spark");
		obj.append(" Institute");
		System.out.println("Append : "+obj);
		
		obj.insert(4," Institute one");
		System.out.println("Insert at 4 index and Institute  one :  "+obj);
		
		obj.reverse();
		System.out.println("Reverse : "+obj);

		StringBuffer obj1=new StringBuffer("sparkInstitute");
		obj1.replace(2, 5, "hello");
		System.out.println("Replace from  index 2 to 5 : "+obj1);
		
		System.out.println("Stringbuffer Capaity : "+obj.capacity());

		
	}

}
