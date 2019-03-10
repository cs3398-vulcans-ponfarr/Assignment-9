
package carcraft;

public class AirScoop extends CarOptions() {
	
	public String AirScoop;
	
	public AirScoop()
	{
		System.out.println("AirScoop Constructor");
		
		AirScoop = "Front Facing Scoop";
	}
	
	@Override
	public String GetDescription()
	{
		return super.GetDescription() + "with" + AirScoop + "scoop";
	}
	
}