//log(sin(x) + cos(x))/(tan(x) - cot(x))

class InvalidTanException extends Exception
{
	InvalidTanException(String msg, Throwable cause)
	{
		super(msg,cause);
	}
	
	
}

public class Q11
{
	public static double evaluate(double x) throws InvalidTanException
	{
		 
		double value = Math.log(Math.sin(x) + Math.cos(x))/(Math.tan(x) - (1/Math.tan(x)));
		
		if(x == Math.PI / 2)
		{
			throw new InvalidTanException("tan is invalid",new ArithmeticException());
		}
		else if(x == 0)
		{
			throw new ArithmeticException("divide by zero");
		}
		else if((Math.tan(x) - (1/Math.tan(x)) == 0))
		{
			throw new ArithmeticException("denomeinator cannot be zero");
		}
		else if( (Math.sin(x) + Math.cos(x)) / (Math.tan(x) - (1/Math.tan(x)) ) <= 0 )
		{
			throw new ArithmeticException("log is not defind");
		}
		else
		{
			return value;
		}
	} 
	public static void main(String[] args) throws InvalidTanException {
		
//		System.out.println(Double.MIN_VALUE);
		
		try
		{
			double value = evaluate(Math.PI / 2);
			System.out.println(value);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
	}
}
