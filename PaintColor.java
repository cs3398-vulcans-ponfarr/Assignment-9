package carcraft;

public class PaintColor extends CarOptions() {
	
	public String color;
	
	public PaintColor(String color)
	{
		System.out.println("Paint Color constructor");
		this.color = color;
	}
	
	@Override
	public String getDescription()
	{
		return super.getDescription() + " painted " + this.color;
	}
	
}
