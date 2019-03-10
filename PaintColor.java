package carcraft;

public class PaintColor extends CarOptions() {
	
	protected ICar car;
	public String color;
	
	public PaintColor(ICar car, String color)
	{
		System.out.println("Paint Color constructor");
		this.car = car;
		this.color = color;
	}
	
	@Override
	public String getDescription()
	{
		return " painted " + this.color;
	}
	
}
