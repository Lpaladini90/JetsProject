package jets;

public class F22Raptor extends Jet implements CombatReady {

	public F22Raptor() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public F22Raptor(String make, String model, double speedMPH, double speedMach, int range, long purchasePrice) {
		super(make, model, speedMPH, speedMach, range, purchasePrice);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public String toString() {
		return "F22Raptor [getMake()=" + getMake() + ", getModel()=" + getModel() + ", getSpeedMPH()=" + getSpeedMPH()
				+ ", getSpeedMach()=" + getSpeedMach() + ", getRange()=" + getRange() + ", getPurchasePrice()="
				+ getPurchasePrice() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
	
	
	
	
}
