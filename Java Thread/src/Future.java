import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Future
{
	public static void main(String[] args) throws InterruptedException, ExecutionException 
	{
		CompletableFuture<String> r = CompletableFuture.supplyAsync(()->
		{
			
			return "hello World";
		});
		
		if(r.isDone())
			System.out.println(r.get());
		
		
		
	}
}
