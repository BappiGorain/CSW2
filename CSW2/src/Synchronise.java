class hi extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
	}
}


class hello extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
	}
}

public class Synchronise {
	public static void main(String[] args) {
		
		
		Thread t1 = new hi();
		Thread t2 = new hello();
		t1.start();
		try
		{
			Thread.sleep(10);
		}
		catch(Exception e) {}
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Done");
		
		
		
		
	}
}
