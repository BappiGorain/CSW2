import java.util.*;

public class Q11 
{
	public static void missing(int arr[])
	{
		HashMap<Integer, Integer> hamap = new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			hamap.put(arr[i], hamap.getOrDefault(arr[i], 0) + 1);
		}
		
		for(int i=1;i<=10;i++)
		{
			if(!hamap.containsKey(i))
			{
				System.out.println(i);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {5,1,7,2,9,0,3,6,10};
		missing(arr);
	}
}
