
public class nestedTernaryOperator
{
	public static void main(String[] args)
	{
		int val = 2 < 5 ? 2: 5 < 3 ? 3:5;
		
		int a = 2 > 3 ? 2 : 3 > 4 ? 3 : 4; 
		System.out.println(val);
		
		System.out.println(a);
	}

}
