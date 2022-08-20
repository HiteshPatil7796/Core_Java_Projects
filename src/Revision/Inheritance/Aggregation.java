package Revision.Inheritance;

class Author
{
	String aname;
	int aage;
	String place;
	
	public Author(String n,int a,String p)
	{
		this.aname=n;
		this.aage=a;
		this.place=p;
	}
	
	public String getAuthoorname()
	{
		return aname;
	}
	public int getAge()
	{
		return aage;
	}
	public String getPlace()
	{
		return place;
	}
}

class Book
{
	String bname;
	int price;
	Author au;
	public
		Book(String bname,int price, Author at)
		{
			this.bname=bname;
			this.price=price;
			this.au=at;
		}
		void showdetails()
		{
			System.out.println("Book Name : "+bname);
			System.out.println("Book Price : "+price);
			System.out.println("author Name : "+au.getAuthoorname());
			System.out.println("Author place : "+au.getPlace());
			System.out.println("Author Age : "+au.getAge());
		}
}
public class Aggregation {

	public static void main(String[] args) {
		
		Author obj=new Author("Authorone",24,"Pune");
		Book obj1=new Book("Bookone",520,obj);
		obj1.showdetails();

	}

}
