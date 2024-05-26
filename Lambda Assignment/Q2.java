


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
