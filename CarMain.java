
package carcraft;
import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		
		int choice = 9;

		System.out.println("Starting:  Creating Cars without Decorator Pattern\n");
	
		System.out.println("Make a Supercharged Basic Car:");
		ICar carWithSuperCharger = new CarWithSuperCharger();
		System.out.println("Done. " + carWithSuperCharger.GetDescription());
		
		System.out.println("\nMake a Painted Supercharged Basic Car:");
		ICar paintedCarWithSuperCharger = new PaintedCarWithSuperCharger("Blue");
		
		System.out.println("Done. " + paintedCarWithSuperCharger.GetDescription() + '\n');
		
		System.out.println("Starting:  Creating Cars with Decorator Pattern\n");
		
		// start a while loop
		while (choice != 0) {
			System.out.println("Which decorator would you like to add?");
			System.out.print('\t' + "1: Color and Airscoop" + '\n');
			System.out.print('\t' + "2: Color and SportWheels" + '\n');
			System.out.print('\t' + "3: Color and SuperCharger" + '\n');
			System.out.print('\t' + "4: Color, SuperCharger, AirScoop" + '\n');
			System.out.print('\t' + "5: Color, SuperCharger, AirScoop, and SportWheels" + '\n');
			System.out.print('\t' + "6: Color Only" + '\n');
			System.out.print('\t' + "0: Exit" + '\n');
			
			Scanner in = new Scanner(System.in);
			choice = in.nextInt();
			
			if (choice > 5 || choice < 0) {
				System.out.println("The choices are between 0 and 5. Check your input and try again.");
			} 
			else {
				switch (choice) {
					case 1:
						ICar carWithOptions = new Color(new AirScoop("Forward ");
						System.out.println("Done. " + carWithOptions.GetDescription());
						break;
					case 2:
						ICar carWithOptions = new Color(new SportWheels("Shiny ");
						System.out.println("Done. " + carWithOptions.GetDescription());
						break;
					case 3:
						ICar carWithOptions = new Color(new SuperCharger("Overcharged "));
						System.out.println("Done. " + carWithOptions.GetDescription());
						break;
					case 4:
						ICar carWithOptions = new Color(new SuperCharger(new AirScoop("Sweet Options")));
						System.out.println("Done. " + carWithOptions.GetDescription());
						break;
					case 5:
						ICar carWithOptions = new Color(new SuperCharger(new AirScoop(new SportWheels("Most Sick Options"))));
						System.out.println("Done. " + carWithOptions.GetDescription());
						break;
					case 6:
						ICar carWithOptions = new Color("Basic Option");
						System.out.println("Done. " + carWithOptions.GetDescription());
						break;
					default:
						System.out.println("Terminating... ");
						break;
				}
			}
			System.out.print("\n");
		}
		// end program
		System.exit(0);
	}

}

