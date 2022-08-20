package Inheritance;

class Author
{
	String authorname;
	int age;
	String place;
	public
		Author(String n,int a, String p)
		{
			this.authorname=n;
			this.age=a;
			this.place=p;
		}
	public String getAuthorname()
	{
		return authorname;
	}
	public int getAge()
	{
		return age;
	}
	public String getPlace()
	{
		return place;
	}
		
}
class Book
{
	String name;
	int price;
	Author auth;
	
	public
			Book(String n,int p,Author at)
			{
				this.name=n;
				this.price=p;
				this.auth=at;
			}
			void showDetatils()
			{
				System.out.println("Book name : "+name);
				System.out.println("Book Price : "+price);
				System.out.println("Author Name : "+auth.getAuthorname());
				System.out.println("Author age : "+auth.getAge());
				System.out.println("Author place : "+auth.getPlace());
			}
}
public class Aggregation {

	public static void main(String[] args) {
		Author au=new  Author("Me",22,"India");
		Book obj=new Book("one",120,au);
		obj.showDetatils();

	}

}
