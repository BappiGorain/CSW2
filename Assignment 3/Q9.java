import java.util.HashSet;

public class Q9 
{
	public static void repeat(int arr[])
	{
		HashSet<Integer> haset = new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(haset.contains(arr[i]))
			{
				System.out.println(arr[i]);
			}
			else
			{
				haset.add(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,5,2,4,8,2,1,4};
		repeat(arr);
	}
}
