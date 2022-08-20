package project1;
class Crck
{
	
			String name;
			String team;
			int age;
	public
			Crck()
			{
				name=" ";
				team=" ";
				age=0;
			}
			Crck(String n, String t,int a)
			{
				name=n;
				team=t;
				age=a;
			}
			Crck(Crck obj)
			{
				name=obj.name;
				team=obj.team;
				age=obj.age;
			}
			public String toString()
			{
				return ("Name: "+name+"Team : "+team+"Age : "+age);
			}
}


public class Cricketer {

	public static void main(String[] args) {
		
			Crck obj1=new Crck();
			obj1.age=32;
			obj1.name="virat";
			obj1.team="India";
			System.out.println(obj1);
			
			Crck obj2=new Crck("Virat","India",32);
			System.out.println(obj2);
			
			Crck obj3=new Crck(obj2);
			System.out.println(obj3);
			

	}

}
