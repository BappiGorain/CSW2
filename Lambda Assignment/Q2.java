/*
 Write a program that demonstrates lazy evaluation by creating a lazy sequence of prime numbers. Define a lazy
 sequence using lambda expressions that generates prime numbers. Demonstrate lazy evaluation by printing the first
 few prime numbers from the lazy sequence.
 */


import java.util.ArrayList;

class Q2
{
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		list.add("BuleBerry");
		list.add("DragonFruit");
		
		
		list.sort((s1,s2) -> {
		 return Integer.compare(s2.length(), s1.length());
		 });
		
		for(String s : list)
		{
			System.out.println(s);
		}
		
		
	}
}
