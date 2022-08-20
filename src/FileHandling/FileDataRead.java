package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDataRead {

	public static void main(String[] args) {
		
		try
		{
			File f=new File("F:\\workspaces\\jdbls\\project1\\src\\FileHandling/File.txt");
			BufferedReader br=new BufferedReader(new FileReader(f));
			String str;
			while((str=br.readLine())!=null)
			{
				System.out.println(str);
			}
			br.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
