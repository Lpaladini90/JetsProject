package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet implements Travel{

	public PassengerJet() { 
	        
	}  

	public PassengerJet(String make, String model, double speedMPH, int range, long purchasePrice) {
		super(make, model, speedMPH, range, purchasePrice);
	}


	@Override
	public String toString() {
		String output = "\nPassenger Jet |  Make: " + getMake() + " | " + "Model: " + getModel() + " | "
				+ "Speed(MPH): " + getSpeedMPH() + " | " + " Range: " + getRange() + " NM | " + "Price: $" + getPurchasePrice();
		return output;
	}

	
	@Override
	public void travel() {
		System.out.println("Let's travel the world! So many places to go and see!");
		
	}
	
	
}


