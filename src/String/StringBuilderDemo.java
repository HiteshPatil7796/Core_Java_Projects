package String;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder obj=new StringBuilder("Spark Institute");
		obj.append(" Hello ");
		System.out.println(" Append : "+obj);

		StringBuilder obj1=new StringBuilder("Spark Institute");
		obj1.insert(5, " Hello ");
		System.out.println("Insert : "+obj1);
		
		System.out.println("Reverse : "+obj1.reverse());
		
		StringBuilder obj2=new StringBuilder("Spark Institute Rocks");
		obj2.replace(5, 16, " Company ");
		System.out.println("Replace : "+obj2);
		
		System.out.println("Capacity of String Builder : "+obj2.capacity());
		
		StringBuilder obj3=new StringBuilder("Spark Institute");
		System.out.println(obj3.capacity());
		StringBuilder obj4=new StringBuilder("Spark Institute hello ");
		System.out.println(obj4.capacity());
		StringBuilder obj5=new StringBuilder("Spark");
		System.out.println(obj5.capacity());
		
	}

}
