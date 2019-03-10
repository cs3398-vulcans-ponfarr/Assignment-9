
package carcraft;

public class AirScoop extends CarOptions() {
	
	public String AirScoop;
	
	public AirScoop(String scoop)
	{
		System.out.println("AirScoop Constructor");
		
		AirScoop = scoop;
	}
	
	@Override
	public String getDescription()
	{
		return super.getDescription() + "with" + AirScoop + "scoop";
	}
	
}