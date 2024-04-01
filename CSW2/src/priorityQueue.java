import java.util.*;
public class priorityQueue 
{
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		pq.add(5);
		pq.add(2);
		pq.add(12);
		pq.add(21);
		pq.add(7);
		pq.add(9);
		System.out.println(pq);
		
		Iterator<Integer> itr = pq.iterator();
		
		System.out.println(itr.next());
		
		while(itr.hasNext())
		{
			
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		while(!pq.isEmpty())
		{
			System.out.print(pq.poll() + " ");
		}
		
	}
}
