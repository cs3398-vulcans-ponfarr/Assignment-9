package carcraft;

public class CarMain
{
	//CarOptions template = new AirScoop(new PaintColor(new SportWheels(new SuperCharger(new CarOptions(), "SuperCharger_type"), "SportWheels_type"), "PaintColor_type"), "AirScoop_type");
	CarOptions car1 = new SuperCharger(new PaintColor(new SportWheels(new CarOptions(), "18-inch"), "blue"), "Powerplus");
	CarOptions car2 = new SuperCharger(new PaintColor(new SportWheels(new AirScoop(new CarOptions(), "aluminum"), "17-inch"), "red"), "centrifugal");
	CarOptions car3 = new AirScoop(new PaintColor(new SportWheels(new SuperCharger(new CarOptions(), "axial compressor"), "18-inch"), "black"), "classic");
	CarOptions car4 = new PaintColor(new SportWheels(new CarOptions(), "40-inch"), "hot-pink");
	CarOptions car5 = new SuperCharger(new PaintColor(new SportWheels(new CarOptions(), "17-inch"), "matte black", "pressure wave");
	CarOptions car6 = new SportWheels(new PaintColor(new CarOptions(), "magenta"), "15-inch");
	car1.getDescription();
	car2.getDescription();
	car3.getDescription();
	car4.getDescription();
	car5.getDescription();
	car6.getDescroption();
}