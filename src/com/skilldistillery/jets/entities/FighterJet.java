package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady{

	public FighterJet() { 
	}

	public FighterJet(String make, String model, double speedMPH, int range, long purchasePrice) {
		super(make, model, speedMPH, range, purchasePrice);
	}

	@Override
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
		System.out.println(makeModel() + ": Lets Fight- PEW PEW PEW "
				+ "\n Watch out!");
	}

	

}
