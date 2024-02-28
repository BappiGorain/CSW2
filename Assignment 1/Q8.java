package model;


interface Vehicle
{
	void accelerate(double speed,double duration);
	void brake();
}

class Car implements Vehicle
{
	
	private String carName;
	private String carModel;
	
	
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	@Override
	public void accelerate(double speed,double duration)	
	{
			
		System.out.println("Go with the speed of " + speed + " km/hr for " + duration + " minute");
	}
	@Override
	public void brake()
	{
		System.out.println("Stop the car");
	}
	
	
//	public void accelerate(double speed)
//	{
//		System.out.println("Go with the speed of " + speed);
//	}
}



class Bicycle implements Vehicle
{
	
	private String BicycleName;
	private String BicycleModel;
	
	
	public String getBicycleName() {
		return BicycleName;
	}
	public void setBicycleName(String bicycleName) {
		BicycleName = bicycleName;
	}
	public String getBicycleModel() {
		return BicycleModel;
	}
	public void setBicycleModel(String bicycleModel) {
		BicycleModel = bicycleModel;
	}
	@Override
	public void accelerate(double speed,double duration)
	{
		System.out.println("Go with the speed of " + speed + " km/hr for " + duration + " minute");
	}
	@Override
	public void brake()
	{
		System.out.println("Stop the Bicycle");
	}
	
//	public void accelerate(double speed)
//	{
//		System.out.println("Go with the speed of " + speed);
//	}
}


class Owner 
{
	private String name;
	private String state;
	private String drivingLicence;
	
	Vehicle v1;
	Vehicle v2; 
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDrivingLicence() {
		return drivingLicence;
	}
	public void setDrivingLicence(String drivingLicence) {
		this.drivingLicence = drivingLicence;
	}
	public Vehicle getV1() {
		return v1;
	}
	public void setV1(Vehicle v1) {
		this.v1 = v1;
	}
	
	public Vehicle getV2() {
		return v1;
	}
	public void setV2(Vehicle v2) {
		this.v1 = v2;
	}	
	
	void display()
	{
		System.out.println("Name:"  + name + ", State:" + state + ", Driving Licence:" + drivingLicence);
	}
}


public class Q8
{
	public static void main(String args[])
	{
		Owner o = new Owner();
		o.setName("Abhijeet");
		o.setState("Benglore");
		o.setDrivingLicence("Yes");
		o.display();
		
		Car c1 = new Car();
		o.setV1(c1);
		
		Car c2 = new Car();
		o.setV2(c2);
		
		c1.accelerate(60, 10);
		c1.brake();
		
		c2.accelerate(50, 15);
		c2.brake();
		
		Bicycle b1 = new Bicycle();
		Bicycle b2 = new Bicycle();
		
		o.setV1(b1);
		o.setV2(b2);
		
		b1.accelerate(40, 20);
		b1.brake();
		
		b2.accelerate(70, 18);
		b2.brake();
		
		
	}
}
