class Communication
{
	String msg;
	boolean written = false;
	
	
	public void send(String s)
	{
		while(written);
		this.msg = s;
		written = true;
	}
	
	public String receive()
	{
		while(!written);
		written = false;
		return msg;
	}
}




public class Sender_Receiver 
{
	public static void main(String[] args) throws InterruptedException
	{
		Communication c = new Communication();
		
		Runnable sendmsg = () ->
		{
			
			for(int i=0;i<50;i++)
			{
				c.send("Hello: "+i);
				
			}
		};
		
		Runnable receivemsg = () ->
		{
			for(int i=0;i<50;i++)
			{
				System.out.println(c.receive());
			}
		};
		
		Thread sender = new Thread(sendmsg);
		Thread receiver = new Thread(receivemsg);
		
		sender.start();
		
		if(!sender.isAlive())
		{
			System.exit(0);
		}
		receiver.start();
		
		
		
	}
	
}
