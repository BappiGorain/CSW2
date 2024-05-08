
public class Increment_Decrement
{
	static int counter = 0;
	
	public static void main(String[] args)
	{
		Thread t = new Thread();
		t.start();
		System.out.print(counter);
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		counter++;
		System.out.print(counter);
	}
	public static void run()
	{
		counter--;
	}
}
