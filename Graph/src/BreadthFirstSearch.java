import java.util.*;
import java.util.Scanner;

public class BreadthFirstSearch
{
	public static void bfs(int s, ArrayList<Integer> adj[], boolean vis[])
	{
		Queue<Integer> q = new LinkedList<>();
		q.add(s);
		vis[s] = true;
		while(!q.isEmpty())
		{
			s = q.poll();
			System.out.print(s + " ");
			for(int ele: adj[s])
			{
				if(vis[ele] == false)
				{
					vis[ele] = true;
					q.add(ele);
				}
			}
		}
	 }
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of Vertices: ");
		int V = in.nextInt();
		System.out.print("Enter the number of Edges: ");
		int E = in.nextInt();
		System.out.println("Enter " + E + " Edges");
		ArrayList<Integer> adj[] = new ArrayList[V];
		for(int i=0;i<V;i++)
		{
			adj[i] = new ArrayList<>();
		}
		for(int i=0;i<E;i++)
		{
			int u = in.nextInt();
			int v = in.nextInt();
			adj[u].add(v);
			adj[v].add(u);
		}
		boolean vis[] = new boolean[V];
		for(int i=0;i<V;i++)
		{
			vis[i] = false;
		}
		int s = 0;
		bfs(s,adj,vis);		
	}
}
