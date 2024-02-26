class car
{
	private int make;
	private String  model;
	
	public car() {
		super();
	}
	
	public car(int make, String model) {
		super();
		this.make = make;
		this.model = model;
	}

	public int getMake() {
		return make;
	}
	public void setMake(int make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "car [make=" + make + ", model=" + model + "]";
	}
	
}

class Q1
{
	public static void main(String[] args) 
	{
		car car1 = new car();
		car1.setMake(25238);
		car1.setModel("Bugati");
		
		car car2 = new car(73542,"Royles Royal");
		
		System.out.println(car1);
		System.out.println(car2);
	}
}