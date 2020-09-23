package ferry;



public class Vehicle {
	
	private int size;
	private Passenger[] passengers;
	private int passengerCost;
	private int vehicleCost;
	
	
	
	
	public Vehicle() {
		
	}




	public Vehicle(int size, int pass, int passengerCost, int vehicleCost) {
		super();
		this.size = size;
		this.passengerCost = passengerCost;
		this.vehicleCost = vehicleCost;
		passengers = setPassengers(pass);
	}




	public int getSize() {
		return size;
	}




	public Passenger[] getPassengers() {
		return passengers;
	}




	public int getPassengerCost() {
		return passengerCost;
	}




	public int getVehicleCost() {
		return vehicleCost;
	}

	public int getTotalVehicleCost() {
		return vehicleCost + passengerCost;
	}


	protected Passenger[] setPassengers(int pass){
		Passenger[] temp = new Passenger[pass];
		for (int i = 0; i < pass; i++) {
			Passenger p = new Passenger(passengerCost);
			temp[i] = p;
		}
		
		return temp;
	}




	@Override
	public String toString() {
		return "Vehicle [size=" + size + ", Number of passengers=" + passengers.length + ", passengerCost="
				+ passengerCost + ", vehicleCost=" + vehicleCost + "]";
	}

	
	
	

}
