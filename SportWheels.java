

public class SportWheels extends CarOptions {

	protected CarOptions car;
	public String wheels;

	public SportWheels(CarOptions car, String wheels)
	{
		//System.out.println("AirScoop constructor");
		this.car = car;
		this.wheels = wheels;
	}

	@Override
	public String getDescription()
	{
		return car.getDescription() + " with " + this.wheels + " wheels";
	}

}
