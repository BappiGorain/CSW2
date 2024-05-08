class Odd implements Runnable 
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2 == 1)
			{
				System.out.println(i);
			}
		}
	}
}


class Even implements Runnable 
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}
		}
	}
}


public class Priority 
{
	public static void main(String[] args) throws Exception 
	{
		Thread odd = new Thread(new Odd());
		Thread even = new Thread(new Even());
		
		odd.setPriority(5);
		even.setPriority(10);
		odd.start();
		even.start();
		
		odd.join();
		even.join();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Join");
		}
	}
}
