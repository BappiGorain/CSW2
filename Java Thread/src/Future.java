import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class Future
{
	public static void main(String args[]) throws IOException
	{
		
		CompletableFuture<Integer> cf1 = CompletableFuture.supplyAsync(
			() -> {
				int arr[] = {1,2,3,4,5};
				int sum = 0;
				for(int ele: arr)
				{
					sum+=ele;
				}
				return sum;
			}
		);
		
		CompletableFuture<Double> cf2 = cf1.thenApplyAsync(
				(a) ->
				{
					return Math.sqrt(a);
				});
		
		CompletableFuture<Void> cf3 = cf2.thenAcceptAsync(
				(sq)->
				{
					BufferedWriter bw;
					try 
					{
						bw = new BufferedWriter(new FileWriter("output.txt"));
						bw.write(sq.toString());
						bw.close();
					}   catch (IOException e1) { e1.printStackTrace();}
				});
		
		System.out.println(cf3.join());
		
		
	}
}
