package ferry;

public class Bus extends Vehicle{
	
	private final static int  size = 20;
	private final static int  cost = 200;
	private final static int  passengerCost = 15;

	public Bus(int passangers) {
		
		super(size, passangers, passengerCost, cost);
	}
	

}
