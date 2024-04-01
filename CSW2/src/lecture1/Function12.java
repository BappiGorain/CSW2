package lecture1;

import java.util.function.Function;

//interface Function<T,R> 
//{
//	public R apply(T s);
//}

public class Function12
{
	public static void main(String[] args)
	{
		String s = "ABCD";
		
		Function<String,Character> f = (t) ->
		{
			return t.charAt(0);
		};
		
		System.out.println(f.apply(s));
	}
}
