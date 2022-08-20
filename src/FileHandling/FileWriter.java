package FileHandling;

import java.io.File;
import java.io.*;
import java.io.IOException;

public class FileWriter {

	public static void main(String[] args) throws IOException {
		
		/*try
		{
			File f1=new File("F:\\workspaces\\jdbls\\project1\\src\\FileHandling/Write.txt");
			String str="write this string to my file ";
			FileWriter fw=new FileWriter(f1);
			fw.write(str);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}*/
		
		byte b[]=new byte[100];
		System.out.println("Enter text to be saved in file :  ");
		int bytes=System.in.read(b);
		FileOutputStream fo=new FileOutputStream("F:\\workspaces\\jdbls\\project1\\src\\FileHandling/write.txt");
		fo.write(b,0,bytes);
		System.out.println("Sucessfully data written to file named write.text");
		fo.close();
	}



}
