class Point
{
	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public Point(Point another)
	{
		this.x = another.x;
		this.y = another.y;
		
	}
	
	void display()
	{
		System.out.println("x :" + x + ", y :" + y);
	}
}



public class Q3 
{
	public static void main(String[] args) 
	{
		Point p1 = new Point(2,3);
		System.out.println("Point p1: ");
		p1.display();
		System.out.println();
		
		System.out.println("Point p2: ");
		Point p2 = new Point(p1);
		p2.display();
		System.out.println();
		
		
		System.out.println("New p1:");
		p1.setX(4);		
		p1.setY(5);
		p1.display();
		
		
	}
}
