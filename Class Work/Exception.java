public class Exception 
{
	public static void main(String args[])
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("Cannot divide by zero:");
//			ae.printStackTrace();
		}
		
		int arr[] = {1,2,3,4,5};
		try
		{
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Cheak array Index ");
//			ai.printStackTrace();	
		}
		
		String s = null;
		
		try
		{
			System.out.println(s.equals("ABCD"));
		}
		catch(NullPointerException np)
		{
			System.out.println("String is null");
//			np.printStackTrace();
		}
		
		
		try
		{
			int num = Integer.parseInt("abc");
			System.out.println(num);
		}
		catch(NumberFormatException nf)
		{
			System.out.println("Change String to Integer");	
//			nf.printStackTrace();
		}
		
		Object str= "abcd";
		try
		{
			int a = (int) str ;
		}catch(ClassCastException cs)
		{
			System.out.println("Cannot Cast string to integer");
//			cs.printStackTrace();
		}
		
		finally
		{
			System.out.println("This is a finally Block");
		}
	}
}
