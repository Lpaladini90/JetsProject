package com.skilldistillery.jets.entities;

public class DIYJet extends Jet implements CombatReady{

	
	public DIYJet() {
	}

	public DIYJet(String make, String model, double speedMPH, int range, long purchasePrice) {
		
		super(make, model, speedMPH, range, purchasePrice);
	}

	public String toString() {
		String output = "\nFighter Jet   |  Make: " + getMake() + " | " + "Model: " + getModel() + " | " 
	+ "Speed(MPH): " + getSpeedMPH() + " | " + " Range: " + getRange() + " NM | " + "Price: $" + getPurchasePrice();
		
		return output;
	}

	public String makeModel() {
		String output = getMake() + " " + getModel();
		return output;
	}

	
	@Override
	public void dogFight() {
		
	System.out.println("I'm better than all of you! You're going down! PEWPEW****** PEWPEW************ ");

	
	}
}
