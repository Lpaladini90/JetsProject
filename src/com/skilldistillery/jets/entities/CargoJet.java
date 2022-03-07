package com.skilldistillery.jets.entities;

public class CargoJet extends Jet implements CargoCarrier {

	public CargoJet() {
	}

	public CargoJet(String make, String model, double speedMPH, int range, long purchasePrice) {
		super(make, model, speedMPH, range, purchasePrice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String output = "\nCargo Jet     |  Make: " + getMake() + " | " + "Model: " + getModel() + " | "
				+ "Speed(MPH): " + getSpeedMPH() + " | " + " Range: " + getRange() + " NM | " + "Price: $" + getPurchasePrice();
		
		return output;
	}
	public String makeModel() {
		String output = getMake() + " " + getModel();
		return output;
	}
	

	@Override
	public void loadAllCargo() {
		System.out.println("Load All Cargo!!!!");
	}


}
