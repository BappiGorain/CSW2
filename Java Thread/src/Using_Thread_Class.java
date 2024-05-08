
public class Using_Thread_Class extends Thread 
{
	public static void main(String[] args)
	{
		Using_Thread_Class t = new Using_Thread_Class();	
		t.start();
		for(int i=2;i<=10;i++)
		{
			if((i&1)==0)
			{
				System.out.print(i + " ");
				System.out.print("");
				System.out.print("");
				System.out.print("");
			}
		}
	}
	
	public void run()
	{
		for(int i=1;i<10;i++)
		{
			if((i&1)==1)
			{
				System.out.print(i + " ");
			}
		}
	}
	
	
}
