
package carcraft;

public class AirScoop extends CarOptions() {
	
	public String scoop;
	
	public AirScoop(String a_scoop)
	{
		System.out.println("AirScoop Constructor");
		
		this.scoop = a_scoop;
	}
	
	@Override
	public String getDescription()
	{
		return " with " + this.scoop + " scoop ";
	}
	
}