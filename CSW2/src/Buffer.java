import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Buffer
{
	public static void main(String args[]) throws IOException
	{
		// Scanner obj = new Scanner(System.in);
		Scanner in = new Scanner(new File("input.txt"));
		String name = in.nextLine();
		int age = in.nextInt();
		System.out.println(name + " " + age);
	}
}
