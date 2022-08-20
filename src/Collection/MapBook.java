package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

class Book
{
	public
		int id;
		String name,author,publisher;
		int quantity;
		
		public Book(int id,String name,String author,String publisher,int quantity)
		{
			this.id=id;
			this.name=name;
			this.author=author;
			this.publisher=publisher;
			this.quantity=quantity;
		}
}

public class MapBook {

	public static void main(String[] args) {
		
		Map<Integer,Book> map=new LinkedHashMap<Integer,Book>();
		
		Book b1=new Book(01,"let us c","author one","publisheroone",14);
		Book b2=new Book(02,"cpp","author two","publisherotwo",15);
		Book b3=new Book(03,"java","author two","publisherotwo",11);
		
		map.put(2, b2);
		map.put(1, b1);
		map.put(3, b3);
		
		for(Map.Entry<Integer, Book> entry:map.entrySet())
		{
			int key=entry.getKey();
			Book b=entry.getValue();
			System.out.println(key+" Details : ");
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}

	}

}
