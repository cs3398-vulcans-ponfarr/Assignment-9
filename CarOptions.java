package carcraft;

public class CarOptions implements ICar {
	
	public CarOptions()
	{
		System.out.println("CarOptions constructor");
	}
	
	@Override
	public String getDescription()
	{
		return "Decorated car";
	}
}
