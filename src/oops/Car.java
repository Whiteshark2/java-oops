package oops;

public abstract class Car extends Vehicle {
	int numdoor;
	//int maxspeed;
	public Car()
	{
		super(100);
	}
	public Car(int numdoor,int maxspeed)
	{super(maxspeed);
		
		System.out.println("Car's Constructor");
		this.numdoor = numdoor;
	}
	public boolean isMotorised()
	{
		return false;
	}
	public void print()
	{
		super.print();
		System.out.println("Car "+" Color "+getcolor()+" Maxspeed "+maxspeed+" numdoor "+numdoor);
	}
	public void printMaxspeed()
	{
		System.out.println("maxspeed " +super.maxspeed);
	}

}
