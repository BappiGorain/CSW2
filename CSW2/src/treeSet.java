import java.util.TreeSet;

public class treeSet
{
	public static void main(String args[])
	{
		TreeSet<String> tset = new TreeSet<>();
		tset.add("Apple");
		tset.add("Banana");
		tset.add("Mango");
		tset.add("Apple");
//		tset.add(null);
		
		System.out.println(tset);
		
		System.out.println(tset.contains("Apple"));
		
		tset.remove("Mango");
		System.out.println(tset);
	}
}


