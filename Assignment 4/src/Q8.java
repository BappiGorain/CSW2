public class Q8
{
	public static double sqrt(int x)
	{
		if(x < 0)
		{
			System.out.println("number cannot be negative");
			throw new ArithmeticException();
		}
		else
		{
			return Math.sqrt(x);
		}
	}
	public static void main(String[] args) 
	{	
		
		try
		{
			System.out.println(sqrt(10));
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			
		}
	}
}
