class Pair<K,V>
{
	private K key;
	private V value;
	
	Pair(K key,V value)
	{
		this.key = key;
		this.value = value;
	}
	
	public void setKey(K k)
	{
		this.key = k;
	}
	public K getKey()
	{
		return this.key;
	}
	
	public void setValue(V v)
	{
		this.value = v;
	}
	public V getValue()
	{
		return this.value;
	}

	@Override
	public String toString() {
		return "Pair [key=" + key + ", value=" + value + "]";
	}
	
}

public class Q1 {
	public static void main(String args[])
	{
		Pair<Integer,Integer> p1 = new Pair<>(1,2);
		Pair<String,String> p2 = new Pair<>("3","4");
		System.out.println(p1);
		System.out.println(p2);
	}
}
