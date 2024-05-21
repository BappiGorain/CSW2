class Communication1
{
	String msg;
	boolean written = false;
	static Object lock = new Object();
	
	
	public void send(String s) throws InterruptedException
	{
		synchronized(lock) 
		{
			System.out.println("Sender: " + lock);
			while(written)
			{
				wait();
			}
			this.msg = s;
			written = true;
			notifyAll();
		}
	}
	
	public String receive() throws InterruptedException
	{
		synchronized(lock) 
		{
			System.out.println("Receiver: " + lock);
			while(!written)
			{
				wait();
			}
			written = false;
			notifyAll();
			return msg;
			
		}
	}
}



public class Lock_Notify 
{
	public static void main(String[] args) throws InterruptedException
	{
		Communication1 c = new Communication1();
		
		Runnable sendmsg = () ->
		{
			
			for(int i=0;i<50;i++)
			{
				try 
				{
					c.send("Hello: "+i);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				
			}
		};
		
		Runnable receivemsg = () ->
		{
			for(int i=0;i<50;i++)
			{
				try
				{
					System.out.println(c.receive());
				} 
				catch (InterruptedException e) 
				{
					
					e.printStackTrace();
				}
			}
		};
		
		Thread sender = new Thread(sendmsg);
		Thread receiver = new Thread(receivemsg);
		
		sender.start();
		
		receiver.start();
		
		
		
	}
	
}
