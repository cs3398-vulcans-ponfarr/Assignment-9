
package carcraft;

public class SuperCharger extends CarOptions {

	protected CarOptions car;
	public String superCharger;

	public SuperCharger(CarOptions car, String superCharger)
	{

		//System.out.println("AirScoop constructor");

		this.car = car;
		this.superCharger = superCharger;
	}

	@Override
	public String getDescription()
	{

		return car.getDescription() + " with " + this.superCharger + " supercharger";

	}
}
