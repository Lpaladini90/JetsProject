package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class JetsApplication {

	private Scanner sc = new Scanner(System.in);

	private AirField airField;

	public static void main(String[] args) { 
		JetsApplication jetApp = new JetsApplication();

		jetApp.launch();
		
		
	}
	private void launch() {

		airField = new AirField();
		
		startMenu();

		
		
		// FIND THE SEQUENCE TO UNLOCK A SECRET WAR MENU!
	
	}
	private void startMenu() {
		boolean menu = true;
		while (menu) {

			System.out.println("\n\n ~ Choose from the following menu: ~ ");
			System.out.println("\n----------------------------------------------");
			System.out.println("- 1.  List of entire fleet with details.     -");
			System.out.println("- 2.  Fly all jets.                          -");
			System.out.println("- 3.  View fastest jet in the fleet.         -");
			System.out.println("- 4.  View jet with the longest range.       -");
			System.out.println("- 5.  Load the cargo jets with supplies.     -");
			System.out.println("- 6.  Dog Fight with all fighter jets.       -");
			System.out.println("- 7.  Travel the world.                      -");
			System.out.println("- 8.  Add a new jet to the fleet.            -");
			System.out.println("- 9.  Remove a jet from the fleet.           -");
			System.out.println("- 10. Fly a jet of your choice.              -");
			System.out.println("- 11. Quit the program.                      -");
			System.out.println("----------------------------------------------");

			int choice = sc.nextInt();
			
			switch (choice) {

			case 1:
				System.out.println("-------------------------------------------------------------------------------------------------------------------------");
				airField.printFleet();
				System.out.println("-------------------------------------------------------------------------------------------------------------------------");
				break;

			case 2:
				this.airField.fly();
				break;

			case 3:
				this.airField.fastestJet();
				break;

			case 4:

				this.airField.longestRange();

				break;

			case 5:
				this.airField.loadAllCargo();

				break;

			case 6:

				this.airField.dogFight();
				break;

			case 7:

				this.airField.travelTheWorld();

				break;

			case 8:
				this.airField.addAJet(sc);

				break;

			case 9:
				this.airField.removeAJet(sc);

				break;

			case 10:
				this.airField.flyAJet(sc);
				
				break;
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
