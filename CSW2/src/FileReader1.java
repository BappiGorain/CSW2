import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1
{
	public static void main(String args[]) throws IOException
	{
//		FileReader fr = new FileReader(new File("input.txt"));
		FileInputStream fr = new FileInputStream(new File("input.txt"));
		int line;
		while((line = fr.read()) != -1)
		{
			System.out.println(Integer.toHexString(line) + ":"+(char)line);
		}
		fr.close();
	}
}