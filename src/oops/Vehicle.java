package oops;

public abstract class Vehicle {
	private String color;
	protected int maxspeed;
	public Vehicle(int maxspeed)
	{
		System.out.println("Vehicle's Constructor");
		this.maxspeed = maxspeed;
	}
	public void setcolor(String color)
	{
		this.color = color;
	}
	public abstract boolean isMotorised();
	public abstract String getCompany();
	public  String getcolor()
	{
		return color;
	}
	public void print()
	{
		System.out.println("Vehicle "+ "Color "+color +" MaxSpeed "+maxspeed);
	}


}
