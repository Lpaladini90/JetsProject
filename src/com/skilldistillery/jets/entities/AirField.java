package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {

	public AirField() {
		this.buildAirField(fileName);
	}

	String fileName = "JetsInfo.txt";

	List<Jet> jetFleet = new ArrayList<>();

	public void buildAirField(String fileName) {

		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String jetList;
			while ((jetList = bufIn.readLine()) != null) {
				String[] jetInfo = jetList.split(",");

				if (jetList.contains("Fighter Jet")) {
					String make = jetInfo[1];
					String model = jetInfo[2];
					double speedMPH = Double.parseDouble(jetInfo[3]);
					int range = Integer.parseInt(jetInfo[4]);
					long purchasePrice = Long.parseLong(jetInfo[5]);

					FighterJet fighterJet = new FighterJet(make, model, speedMPH, range, purchasePrice);
					jetFleet.add(fighterJet);
				}

				if (jetList.contains("Passenger Jet")) {
					String make = jetInfo[1];
					String model = jetInfo[2];
					double speedMPH = Double.parseDouble(jetInfo[3]);
					int range = Integer.parseInt(jetInfo[4]);
					long purchasePrice = Long.parseLong(jetInfo[5]);

					PassengerJet passengerJet = new PassengerJet(make, model, speedMPH, range, purchasePrice);
					jetFleet.add(passengerJet);

				}

				if (jetList.contains("Cargo Jet")) {
					String make = jetInfo[1];
					String model = jetInfo[2];
					double speedMPH = Double.parseDouble(jetInfo[3]);
					int range = Integer.parseInt(jetInfo[4]);
					long purchasePrice = Long.parseLong(jetInfo[5]);

					CargoJet cargoJet = new CargoJet(make, model, speedMPH, range, purchasePrice);
					jetFleet.add(cargoJet);
				}

			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public void printFleet() {
		for (Jet jets : jetFleet) {
			System.out.println(jets);

		}
	}

	public List<Jet> list() {
		List<Jet> output = jetFleet;
		return output;
	}

	public void fly() {
		for (int i = 0; i < jetFleet.size(); i++) {
			double hours = ((jetFleet.get(i).getRange()) / (jetFleet.get(i).getSpeedMPH()));
			System.out.printf("\nThe " + jetFleet.get(i).toString()
					+ " will run out of fuel in %.2f hours, better refuel before that!", hours);

		}
	}

	public void fastestJet() {
		double fastest = 0;
		int counter = 0;
		for (int i = 0; i < jetFleet.size(); i++) {
			if (jetFleet.get(i).getSpeedMPH() > fastest) {
				fastest = jetFleet.get(i).getSpeedMPH();
				counter = i;

			}
		}
		System.out.println("The fastest jet is: ");
		System.out.println("\n" + jetFleet.get(counter));
	}

	public void longestRange() {
		int range = 0;
		int counter = 0;
		for (int i = 0; i < jetFleet.size(); i++) {
			if (jetFleet.get(i).getRange() > range) {
				range = jetFleet.get(i).getRange();
				counter = i;

			}
		}
		System.out.println("The jet with the longest range in notical miles is:");
		System.out.println("\n" + jetFleet.get(counter));
	}

	public void dogFight() {
		for (Jet jet : jetFleet) {
			if (jet instanceof FighterJet) {
				((FighterJet) jet).dogFight();

			}
		}
	}

	public void loadAllCargo() {
		for (Jet jet : jetFleet) {
			if (jet instanceof CargoJet) {
				((CargoJet) jet).loadAllCargo();

			}
		}
	}

	public void travelTheWorld() {
		for (Jet jet : jetFleet) {
			if (jet instanceof PassengerJet) {
				((PassengerJet) jet).travel();

			}
		}
	}

	public void addAJet(Scanner sc) {
		System.out.println("\nWhat is the jets make");
		String make = sc.next();

		System.out.println("\nWhat is the model of the " + make);
		String model = sc.nextLine();
		sc.next();
		System.out.println("\nHow fast can the " + make + " go?");
		double speedMPH = (long) sc.nextDouble();

		System.out.println("\nWhat is the mile range of flight for the " + make + " " + model);
		int range = (int) sc.nextLong();

		System.out.println("\nHow much does " + make + " " + model + " cost?");
		long purchasePrice = sc.nextLong();

		DIYJet diyJet = new DIYJet(make, model, speedMPH, range, purchasePrice);
		jetFleet.add(diyJet);

	}

	public void removeAJet(Scanner sc) {
		System.out.println("\nHere is a list of eligible jets to be removed from the air field.");
		System.out.println("-------------------------------");
		int counter = 1;
		for (Jet jet : jetFleet) {
			System.out.println(counter + ": " + jet.makeModel());
			System.out.println("-------------------------------");
			counter++;
		}
		System.out.println("Enter a number to remove the jet.");
		int inputNum = sc.nextInt();
		Jet removedJet = jetFleet.get(inputNum - 1);

		jetFleet.remove(inputNum - 1);

		System.out.println("You have removed the " + removedJet.makeModel() + " from Mad Dog Air Field.");

	}

	public void flyAJet(Scanner sc) {

		System.out.println("Do you have a pilots license: yes or no?");
		String licenseInput = sc.next();
		if (licenseInput.equalsIgnoreCase("yes")) {

		}
		if (licenseInput.equalsIgnoreCase("no")) {
			System.out.println("Proceed to training");
			System.out.println("\n How do you spell fly?");

			String spellFly = sc.next();
			if (spellFly.equalsIgnoreCase("fly")) {
				System.out.println("\nCongrats here is a pilot's license!");

			} else {
				System.out.println("\nCongrats, you get a pilot's license anyways, just dont crash it!");
			}
		}
		System.out.println("\nHere is a list of jets currently in the air field.");
		System.out.println("-------------------------------");
		int counter = 1;
		for (Jet jet : jetFleet) {
			System.out.println(counter + ": " + jet.makeModel());
			System.out.println("-------------------------------");
			counter++;
		}
		System.out.println("Pick which jet you would like to fly:");
		int inputNum = sc.nextInt();
		Jet jetModel = jetFleet.get(inputNum - 1);

		System.out.println("You chose the " + jetModel.makeModel() + " to fly! Have fun, but dont crash it costs $ "
				+ jetModel.getPurchasePrice() + "!");

			if(jetModel.getClass().getSimpleName().contains("FighterJet")) {
				flySequence(sc);
			}
	}

	public void flySequence(Scanner sc) {
		System.out.println("\n Get read to take off.......");
		System.out.println("\n\n PUNCH IT, FULL THROTTLE!");
		System.out.println("\n\n Get to cruise altittude..... ");
		System.out.println("\n\n Maintain cruising attitue and speed...");
		System.out.println("\n\n Watch out you have a Russian MiG on your tail! ");

		System.out.println("\nEVASIVE MANEUVERS NOW!");

		boolean fight = true;
		while (fight) {
			System.out.println("\nChoose a maneuver!");
			
			boolean maneuver = true;
			while(maneuver) {
			System.out.println("\n\n---------------------------------");
			System.out.println("-1. BANK LEFT!                  -");
			System.out.println("-2. BANK RIGHT!                 -");
			System.out.println("-3. DIVE DIVE!                  -");
			System.out.println("-4. COBRA TURN!                 -");
			System.out.println("---------------------------------");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("WATCH OUT ITS STILL ON YOUR TAIL!");

				break;

			case 2:
				System.out.println("WATCH OUT ITS STILL ON YOUR TAIL!");
				break;

			case 3:
				System.out.println("WATCH OUT ITS STILL ON YOUR TAIL!");
				break;

			case 4:
				System.out.println("NICE! NOW CHOSE AN ATTACK!");

				System.out.println("\n\n---------------------");
				System.out.println("-1. Release missile -");
				System.out.println("-2. Gatling Gun     -");
				System.out.println("---------------------");

				int choice2 = sc.nextInt();
				switch (choice2) {

				case 1:
					System.out.println("NICE YOU GOT EM!");
					
					System.out.println("\n\n Whew Close call! Lets decende and land ");
					System.out.println("\n\n Get your landing gear open! ");
					System.out.println("\n\n Landed complete. Go get yourself a beer you deserve it after that dogfight!"); 
					fight = false;
					maneuver = false;
					break;
				case 2:
					System.out.println("NICE YOU GOT EM!");
					
					System.out.println("\n\n Whew Close call! Lets decende and land ");
					System.out.println("\n\n Get your landing gear open! ");
					System.out.println("\n\n Landed complete. Go get yourself a beer you deserve it after that dogfight!");
					fight = false;
					maneuver = false;
					break;

				}
				break;

			default:
				System.out.println("\n\n INVALID MANEUVER TRY AGAIN QUICK!");
				break;
			}
			}
			
			System.out.println(" Nice flying Ace. ");
			System.out.println(" * Returning to main menu * ");

		}
	}

	public void randomFlyingAttack() {

	}

}