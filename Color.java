
package carcraft;

public class Color implements ICar {

	public String color;

	public Color()
	{
		System.out.println("Color constructor");
		
		color = "Hot Rod Red ";
	}
	
	@Override
	public String GetDescription()
	{
		return super.GetDescription() + "with " + color + " color.";
	}

}