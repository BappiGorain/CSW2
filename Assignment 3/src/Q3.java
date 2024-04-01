import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Car implements Comparable<Car>
{
	private int modelNo;
	private String name;
	private int stock;
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Car(int modelNo, String name, int stock) {
		//super();
		this.modelNo = modelNo;
		this.name = name;
		this.stock = stock;
	}
	
	@Override
	public int compareTo(Car c)
	{
		if(this.equals(c))
		{
			return 0;
		}
		if(this.stock > c.stock)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
//	public static void Sort(ArrayList<Car> list)
//	{
//		for(int i=0;i<list.size()-1;i++)
//		{
//			for(int j=0;j<list.size()-1-i;j++)
//			{
//				if(list.get(j).compareTo(list.get(j+1))>0)
//				{
//					Car temp = list.get(j);
//					list.set(j, list.get(j+1));
//					list.set(j+1, temp);
//				}
//			}
//		}
//	}
	@Override
	public String toString() {
		return "Car [modelNo=" + modelNo + ", name=" + name + ", stock=" + stock + "]";
	}
	
	
	
}

class Q3
{
	public static void main(String[] args)
	{
		List<Car> cars = new ArrayList<>();
		cars.add(new Car(2013, "creta" ,10));
		cars.add(new Car(2020, "MG", 13));
		cars.add(new Car(2018, "Kia", 20));
		cars.add(new Car(2017, "Audi", 45));
		cars.add(new Car(2015, "BMW", 55));
		
		// Car.Sort(cars);
		// System.out.println(cars);
		
		Collections.sort(cars);
		System.out.println(cars);
		
	}
}