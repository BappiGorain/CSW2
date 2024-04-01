import java.util.*;
public class Q13 
{
	
	public static void solve(int arr[])
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<arr.length;i++)
		{
			pq.add(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(pq.remove());
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,10,8,7,3,4,6,5,9};
		solve(arr);
	}
	
}
