class Book<T1,T2>
{
	private T1 bookId;
	private T2 name;
	
	Book(T1 bid,T2 n)
	{
		bookId = bid;
		name = n;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + "]";
	}
	
}

class Q2
{
	public static void main(String[] args) 
	{
		Book<Integer,String> b1 = new Book<Integer,String>(1,"Java book");
		System.out.println(b1);
		Book<Integer,Double> b2 = new Book<Integer,Double>(1,5.5);
		System.out.println(b2);
	}
}