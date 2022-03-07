package com.skilldistillery.jets.entities;

import java.util.Objects;

public abstract class Jet  {
	private String make;
	private String model;
	private double speedMPH;
	private int range;
	private long purchasePrice;

	public Jet() {
	}

	public Jet(String make, String model, double speedMPH, int range, long purchasePrice) {
		this.make = make;
		this.model = model;
		this.speedMPH = speedMPH;
		this.range = range;
		this.purchasePrice = purchasePrice;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeedMPH() {
		return speedMPH;
	}

	public void setSpeedMPH(double speedMPH) {
		this.speedMPH = speedMPH;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(long purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
	//make a fly method that displays a noise with the fly method when fly is called

	@Override
	public String toString() {
		String output = "Jet: " + getMake() + " | " + getModel() + " | " + getSpeedMPH() + " | " + getRange() + " | "
				+ getPurchasePrice();
		return output;
	}

	public String makeModel() {
		String output = getMake() + " " + getModel();
		return output;
	}

	@Override
	public int hashCode() {
		return Objects.hash(make, model, purchasePrice, range, speedMPH);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		return Objects.equals(make, other.make) && Objects.equals(model, other.model)
				&& purchasePrice == other.purchasePrice && range == other.range
				&& Double.doubleToLongBits(speedMPH) == Double.doubleToLongBits(other.speedMPH);
	}
}
