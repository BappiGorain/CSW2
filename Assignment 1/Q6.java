abstract class LibraryResource
{
	private String title;
	private String auther;
	
	public LibraryResource(String title, String auther)
	{
		this.title = title;
		this.auther = auther;
	}
	
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getAuther()
	{
		return auther;
	}
	public void setAuther(String auther)
	{
		this.auther = auther;
	}
	
	abstract void displayDetails();

}





class Book extends LibraryResource
{
	private int countPage;
	public Book(int countpage,String title, String auther)
	{
		super(title, auther);
		this.countPage = countpage;
	}
	
	public int getCountPage() {
		return countPage;
	}
	public void setCountPage(int countPage) {
		this.countPage = countPage;
	}
	
	@Override
	void displayDetails()
	{
		System.out.println("Title: " + getTitle() + " Auther: " + getAuther() + " CountPage: " + countPage);
	}
}





class Magazine extends LibraryResource
{
	private int date;

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public Magazine(String title, String auther, int date) {
		super(title, auther);
		this.date = date;
	}
	
	@Override
	void displayDetails()
	{
		System.out.println("Title: " + getTitle() + " Auther: " + getAuther() + " Date: " + date);
	}
}




class DVD extends LibraryResource
{
	private String duration;

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public DVD(String title, String auther, String duration) {
		super(title, auther);
		this.duration = duration;
	}
	
	@Override
	void displayDetails()
	{
		System.out.println("Title: " + getTitle() + " Auther: " + getAuther() + " Duration: " + duration);
	}
}




public class Q6
{
	public static void main(String args[])
	{
		Book b = new Book(300,"Java Book", "Mayur Ramgir");
		DVD d = new DVD("Java Book", "Mayur Ramgir", "1:00");
		Magazine m = new Magazine("Java Book", "Mayur Ramgir", 15);
		
		b.displayDetails();
		d.displayDetails();
		m.displayDetails();
		
	}
}