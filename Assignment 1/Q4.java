class Laptop
{
	private String model;
	private int price;
	
	public void setModel(String m)
	{
		this.model = m;
	}
	
	public void setPrice(int p)
	{
		this.price = p;
	}
	
	@Override
	public String toString()
	{
		return "Laptop[model: " + model + ", price: "+ price + "]";
	}
}


public class Q4 
{
	public static void main(String args[])
	{
		Laptop l = new Laptop();
		l.setModel("Pulsur R15");
		l.setPrice(120000);
		System.out.println(l);
	}
}
