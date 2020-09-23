package ferry;

public class Lorry extends Vehicle{

	private final static int size = 40;
	private final static int cost = 300 ;
	private final static int passengerCost  = 20; 
	
	
	public Lorry(int pass) {
		super(size, pass, passengerCost, cost);
	}
}
