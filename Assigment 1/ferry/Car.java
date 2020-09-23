package ferry;

public class Car extends Vehicle {
	
	private final static int  size = 5;
	private final static int  cost = 100;
	private final static int  passengerCost = 20;
	
	public Car(int pass) {
		
	    super(size, pass, passengerCost, cost);
	}
	
	

}
