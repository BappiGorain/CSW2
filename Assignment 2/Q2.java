

class Book
{
	private int bookId;
	private String bookName;
	private double price;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(int bookId, String bookName, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + "]";
	}	
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Book)
		{
			if(this == obj)
			{
				return true;
			}
			Book b = (Book) obj;
			if(this.price == b.price)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}
	
	
	public void compareTo(Object obj)
	{
		if(this.equals(obj))
		{
			System.out.println("Both price is same");
		}
		else if(this.getPrice() > ((Book) obj).getPrice())
		{
			System.out.println("price of Book1 is more");
		}
		else
		{
			System.out.println("Price of Book2 is more");
		}
	}
}

public class Q2
{
	public static void main(String args[])
	{
		Book book1 = new Book(1,"java Frontend Development",500);
		Book book2 = new Book(2,"java Backend Development",400);
		
		System.out.println(book1);
		System.out.println(book2);
		
		book1.compareTo(book2);
		
		
	}	
}
