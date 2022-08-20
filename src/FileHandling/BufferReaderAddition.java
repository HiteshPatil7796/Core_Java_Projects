package FileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderAddition {

	public static void main(String[] args) throws IOException {
		String text;
		int a,b,c;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter A : ");
		a=Integer.parseInt(br.readLine());
		System.out.println("Enter B : ");
		b=Integer.parseInt(br.readLine());
		c=a+b;
		System.out.println("A + B : "+c);
		
		System.out.println("Enter char : ");
		char ch;
		ch=(char)br.read();
		System.out.println("Character is : "+ch);
		
		
		System.out.println("Enter String : ");
		text=br.readLine();
		System.out.println("String is : "+text);
		
	}

}
