
import java.awt.Color;

package carcraft;

public class PaintColor extends CarOptions() {
	
	public Color color;
	
	public AirScoop(Color color)
	{
		System.out.println("Paint Color constructor");
		
		this.color = color;
	}
	
	@Override
	public String getDescription()
	{
		return super.getDescription() + "with r" + color.getRed() 
		+ "g" + color.getGreen() 
		+ "b" + color.getBlue() + " paint color.";
	}
	
}