
public class Bank
{
	static int bankAcc[] = new int[10];
	public static void main(String[] args) 
	{
		for(int i=0;i<10;i++)
		{ 
			bankAcc[i] = 100;
		}
		
		for(int i=0;i<10;i++)
		{	final int from=i;
			Runnable t = () ->
			{
				for(int j=0;j<10;j++)
				{	
					int to =(int) Math.floor((int)Math.random());
					float amt = (float)Math.random()*10;
					transfer(from, to, amt);
				}
			};
			Thread th = new Thread(t);
			th.start();
		}
		
		
	}
	
	
	public static int totalAmt()
	{
		int total = 0;
		for(int amt : bankAcc)
		{
			total+=amt;
		}
		return total;
	}
	
	
	public static void transfer(int from,int to,float amt)
	{
		if(bankAcc[from] >= amt)
		{
			System.out.printf("deducting %5.5f $ from %d \n", amt, from);
			bankAcc[from]-=amt;
			System.out.printf("adding %5.5f $ to %d \n", amt, to);
			bankAcc[to]+=amt;
		}
		
		System.out.println("Total amt: " + totalAmt());
	}
	
}
