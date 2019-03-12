
package carcraft;

public class AirScoop extends CarOptions() {
	
	public String scoop;
	public CarOptions car;
	
	public AirScoop(CarOptions car, String a_scoop)
	{
		//System.out.println("AirScoop Constructor");
		
		this.car = car;
		this.scoop = a_scoop;
	}
	
	@Override
	public String getDescription()
	{
		return " with " + this.scoop + " scoop ";
	}
	
}