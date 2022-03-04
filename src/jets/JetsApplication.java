package jets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JetsApplication {

	private AirField airField;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApplication jetApp = new JetsApplication();
		jetApp.start();
		
		jetApp.launch();
	}

	private void start() {
		
		menu(sc);
	
	
	

		
	}

	private void launch() {

	}
	
	

	private void menu(Scanner sc) {
		
			
		System.out.println("Choose from the following menu: ");
		System.out.println("\n--------------------------------------");
		System.out.println("-1. List Fleet                       -");
		System.out.println("-2. Fly All Jets                     -");
		System.out.println("-3. View Fastest Jet                 -");
		System.out.println("-4. View Jet With Longest Range      -");
		System.out.println("-5. Load All Cargo                   -");
		System.out.println("-6. Dogfight!                        -");
		System.out.println("-7. Travel The World                 -");
		System.out.println("-8. Add A Jet To The Fleet           -");
		System.out.println("-9. Remove A Jet From The Fleet      -");
		System.out.println("-10 Fly A Jet- You Pick!             -");
		System.out.println("-11. Quit                            -");
		System.out.println("--------------------------------------");


		boolean menu = true;
			while (menu) {
				int choice = sc.nextInt();

				switch (choice) {

				case 1:
				// List fleet prints out the model, speed, range, and price of each jet. (There
				// must be at least 5 jets stored when the program starts).

					break;

				case 2:
				// Fly all Jets calls the fly() method on the entire fleet of jets. fly() prints
				// out the jet details and the amount of time the jet can fly until it runs out
				// of fuel (based on speed and range).

					break;

				case 3:
				// The view fastest jet and longest range options both print out all of the
				// information about a jet.
				// Note: these methods must search the collection of jets to find the
				// appropriate jet.

					break;

				case 4:
				// Same as above

					break;

				case 5:

				// The user is presented with an option specific to the interfaces you created.
				// For example, Load all Cargo Jets, above, finds all implementors of the
				// CargoCarrier interface and calls loadCargo() on each. (Note that the menu
				// text is italicized because your options may be different, depending on your
				// interfaces.)

					break;

				case 6:

				// Same as above

					break;

				case 7:

				// Same as above

					break;

				case 8:

				// A user can add custom jets to the fleet.
				//This can be a JetImpl.
				//Stretch Goal: This leads to a sub-menu where the user chooses the type of Jet.
				//Users then enter information for the Jet, and it is added to the AirField.

					break;

				case 9:
				
				//A user can remove a jet from the fleet.
				//The user is presented with a sub-menu to select a jet to delete by number.
				//Stretch Goal: a user can remove a jet (or jets) by name.

					break;

				case 10:
				
					System.out.println("Do you have a pilots license: yes or no?");
					String licenseInput  = sc.next();
						if(licenseInput.equalsIgnoreCase("yes")) {
						
						} if(licenseInput.equalsIgnoreCase("no")) {
							System.out.println("Proceed to training");
							System.out.println("\n How do you spell fly?");
						
							String spellFly = sc.next();
								if(spellFly.equalsIgnoreCase("fly")) {
									System.out.println("\nCongrats here is a pilot's license!");
								
								} else {
									System.out.println("\nCongrats, you get a pilot's license anyways, just dont crash it!");
							}
						}
					
						System.out.println("---------------------------");
						System.out.println("-   Pick a jet to fly!    -");
						System.out.println("-1.                       -");
						System.out.println("-2.                       -");
						System.out.println("-3.                       -");
						System.out.println("-4.                       -");
						System.out.println("-5.                       -");
						System.out.println("-6.                       -");
						System.out.println("-7. Quit                  -");
						System.out.println("---------------------------");
				
				
						boolean secondMenu = true;
						while(secondMenu) {
							choice = sc.nextInt();
							switch(choice) {
					
							case 1:
					
								break;
					
							case 2:
					
								break;
					
					
							case 3:
					
								break;
					
					
							case 4:
					
								break;
					
					
							case 5:
					
								break;
					
					
							case 6:
					
								break;
					
					
							case 7:
								System.out.println("Hope you had fun flying!");
								System.out.println("You will be returned to the main menu");
								secondMenu = false;
//								jetApp.menu(sc);
								
								break;
					
						
							default:
								System.out.println("Invalid choice.");
						
								break;
							}
					
						}
						
				continue;
				
				
				case 11: 
					System.out.println("Thank you for visiting Mad-Dog Air Field Base. \nGood-Bye");
					menu = false;
					break;

				default:
					System.out.println("Invalid response, your choice is 1-10");
					break;

				}
			}
			sc.close();
		}
	}

