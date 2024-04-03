public class Q2
{
	public static void main(String[] args)
	{
		String str = "ab1a6fa4io7dg8";
		boolean consonenet = false;
		boolean vowel = false;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) >=48 && str.charAt(i)<=58)
			{
				int j = i-1;
				while(j>=0 && !(str.charAt(j) >='0' && str.charAt(j)<='9'))
				{
					if(str.charAt(j)>='a' && str.charAt(j)<='z')
					{
					
						if(str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' ||str.charAt(j) == 'o' ||str.charAt(j) == 'u')
						{
							vowel = true;
						}
						else
						{
							consonenet = true;
						}
					}
					j--;
				}
				if(vowel && consonenet)
				{
					System.out.println(str.charAt(i));
				}
				consonenet = false;
				vowel = false;
				
			}
		}
		
		
		
	}
}
