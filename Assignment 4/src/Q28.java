
public class Q28
{
	static void fun(int a)
	{
		fun(a);
	}
	public static void main(String[] args)
	{
		try
		{
			fun(10);
		}
		catch(StackOverflowError e)
		{
			System.out.println("Error");
			e.printStackTrace();
		}

	}
}
