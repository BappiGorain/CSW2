class Rectangle 
{
	private double length;
	private double breadth;
	
	
	
	public Rectangle() {
		super();
	}


	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}


	double perimeter(double length, double breadth)
	{
		return (2 * (length+breadth));
	}
	
	double area(double length, double breadth)
	{
		return (length * breadth);
	}
	
}


public class Q2 
{
	public static void main(String[] args) 
	{
		Rectangle rect = new Rectangle();
		
		double area = rect.area(4.5, 3.5);
		System.out.println("Area of perimeter: " + area);
		
		double peri = rect.perimeter(10, 3);
		System.out.println("Perimeter of Rectangle: " + peri);
		
		
	}
}
