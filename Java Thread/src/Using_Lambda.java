
public class Using_Lambda
{
	public static void main(String[] args)
	{
		Runnable odd =() ->
 			{
				for(int i=1;i<=10;i++)
				{
					if(i%2==1)
					{
						System.out.println(i);
					}
				}
			};
				
				
				Runnable even = () ->					
					{
						for(int i=1;i<=10;i++)
						{
							if(i%2==0)
							{
								System.out.println(i);
							}
						}
					};
						
						Thread o = new Thread(odd);
						Thread e = new Thread(even);
						
						o.start();
						e.start();
				
	}
}


