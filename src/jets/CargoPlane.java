package jets;

public class CargoPlane extends Jet implements CargoCarrier{

	public CargoPlane() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public CargoPlane(String make, String model, double speedMPH, double speedMach, int range, long purchasePrice) {
		super(make, model, speedMPH, speedMach, range, purchasePrice);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void loadCargo() {
		// TODO Auto-generated method stub
		
	}
	
	

}
