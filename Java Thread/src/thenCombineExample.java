import java.util.concurrent.CompletableFuture;

public class thenCombineExample 
{
	public static void main(String args[])
	{
		CompletableFuture<Double> cf1 = CompletableFuture.supplyAsync(
				()->{
					return Math.random();
				});
		
		CompletableFuture<Double> cf2 = CompletableFuture.supplyAsync(
				()->{
					return Math.random();
				});
		
		CompletableFuture<Double> cf3 = cf1.thenCombine(cf2,(n1,n2)->
		{
			return n1 * n2;
		});
		
		
		System.out.println(cf3.join());
	}
}
