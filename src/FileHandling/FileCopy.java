package FileHandling;

import java.io.*;
//import java.io.FileReader;
//import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {

		try
		{
		
			FileInputStream ins=new FileInputStream("F:\\\\workspaces\\\\jdbls\\\\project1\\\\src\\\\FileHandling/File1.txt");
			FileOutputStream outs=new FileOutputStream("F:\\\\workspaces\\\\jdbls\\\\project1\\\\src\\\\FileHandling/File2.txt");
			
			byte Byteread;
			do
			{
				Byteread=(byte)ins.read();
				outs.write(Byteread);
			}
			while(Byteread!=-1);
			System.out.println("FIle data write success ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
