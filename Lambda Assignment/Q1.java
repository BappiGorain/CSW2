interface Calculator
{
	double calculate(double a, double b);
}

class Q1
{
	public static void main(String args[])
	{
		Calculator add = (a,b) ->
			{
				return a + b;
			};
				
			
		Calculator substract = (a,b) ->
			{
				return a - b;
			};
						
		Calculator multiplication =(a,b) ->
			{
				return a * b;
			};
					
			
		Calculator divide = (a,b) ->
			{
				return a / b;
			};
				
				
			
		System.out.println(add.calculate(10,20));
		System.out.println(substract.calculate(20, 10));
		System.out.println(multiplication.calculate(10, 20));
		System.out.println(divide.calculate(20, 10));
				
	}
}
