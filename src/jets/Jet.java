package jets;

import java.util.Objects;

public abstract class Jet {
	private String make;
	private String model;
	private double speedMPH;
	private double speedMach;
	private int range;
	private long purchasePrice;

	public Jet() {
		super();
	}

	

	public Jet(String make, String model, double speedMPH, double speedMach, int range, long purchasePrice) {
		this.make = make;
		this.model = model;
		this.speedMPH = speedMPH;
		this.speedMach = speedMach;
		this.range = range;
		this.purchasePrice = purchasePrice;
	}



	public void fly() {
		// method that prints out the jet details and the amount of time the jet can fly
		// until it runs out of fuel (based on speed and range)
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

	public double getSpeedMach() {
		return speedMach;
	}

	public void setSpeedMach(double speedMach) {
		this.speedMach = speedMach;
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

	@Override
	public String toString() {
		return "Jet [model=" + model + ", speedMPH=" + speedMPH + ", speedMach=" + speedMach + ", range=" + range
				+ ", purchasePrice=" + purchasePrice + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(make, model, purchasePrice, range, speedMPH, speedMach);
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
				&& Double.doubleToLongBits(speedMPH) == Double.doubleToLongBits(other.speedMPH)
				&& Double.doubleToLongBits(speedMach) == Double.doubleToLongBits(other.speedMach);
	}

	
	
	
	
}
