class Cat implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Meow");
			try {
				Thread.sleep(100);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class Lion implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Roar");
			try
			{
				Thread.sleep(50);
			} 
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

class Animal implements Runnable
{
	
	String type;
	
	public Animal(String s)
	{
		type = s;
	}
	
	public void run()
	{
		if(type == "Lion")
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Roar");
				try
				{
					Thread.sleep(50);
				} catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		else if(type == "Cat")
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Meow");
				try
				{
					Thread.sleep(50);
				} catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}

public class Using_Runnable
{
	public static void main(String[] args) throws Throwable 
	{
		Thread cat = new Thread(new Animal("Cat"));
		Thread lion = new Thread(new Animal("Lion"));
		
		cat.start();
		lion.start();
	}	
}
