package inheritance_temp;

import oops.Vehicle;

public class Truck extends Vehicle{
	int maxLoadingcapacity;
	
	public void print()
	{
		System.out.println("Vehicle "+ "Color "+ getcolor() +" MaxSpeed "+ maxspeed +"maxLoadingcapacity " +maxLoadingcapacity);
	}
	

}
