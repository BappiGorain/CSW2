// Finally block execute even if there is some exception


import java.util.Scanner;

public class FinallyBlock {
	
	static Scanner sc = new Scanner(System.in);
	
	static int divide(int a, int b)
	{
		try
		{
			int div = a/b;
			return div;
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Denominator cannot be zero");
			System.out.print("Enter denominator again: ");
			int c = sc.nextInt();
			return divide(a,c);
			
		}
		
		finally
		{
			sc.close();
			System.out.println("Finally block Executed");
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(divide(5,0));
		
	}
}



