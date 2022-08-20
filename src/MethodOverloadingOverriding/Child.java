package MethodOverloadingOverriding;

class Parent{}
public class Child extends Parent {

	public
		void check()
		{
			System.out.println("Successfully Casting ");
		}
		public static void show(Parent p)
		{
			if(p instanceof Child)
			{
				Child c1=(Child)p;
				c1.check();
			}
		}
	public static void main(String[] args) {
		
		Parent p=new Child();
		Child.show(p);

	}

}
