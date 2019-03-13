package carcraft;

public class PaintColor extends CarOptions {
	
	protected CarOptions car;
	public String color;
	
	public PaintColor(CarOptions car, String color)
	{
		//System.out.println("Paint Color constructor");
		this.car = car;
		this.color = color;
	}
	
	@Override
	public String getDescription()
	{
		return super.getDescription() + " painted " + this.color;
	}
	
}
