package Revision.Constructor;

class Crck
{
	
		String name;
		String team;
		int age;
	public
		Crck()
		{
			name="";
			team="";
			age=0;
		}
		Crck(String name,String team,int age)
		{
			this.name=name;
			this.team=team;
			this.age=age;
		}
		Crck(Crck obj)
		{
			name=obj.name;
			team=obj.team;
			age=obj.age;
		}
		public String toString()
		{
			return("Name : "+name+" Team : "+team+" Age : "+age);
		}
}
public class Cricketer {

	public static void main(String[] args) {
		
		Crck obj=new Crck();// default COnstructor 
		obj.name="Virat";
		obj.team="India";
		obj.age=25;
		System.out.println("Default Constructor : \n"+obj.toString());
		
		Crck obj2=new Crck("Rahul","India",25);
		System.out.println("Parametrised Constructor : \n "+obj2.toString());
		
		Crck obj3=new Crck(obj2);
		System.out.println("Copy Constrctor : \n"+obj3.toString());
		
				

	}

}
