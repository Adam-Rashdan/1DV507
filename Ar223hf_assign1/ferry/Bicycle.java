package ferry;

public class Bicycle extends Vehicle{
	
	private static final int size = 1;
	private static final int cost = 40;
	private static final int passengerCost = 0; 
	private final static int  Pass = 1;
	
	
	public Bicycle () {
		
		super(size, Pass, passengerCost, cost) ;
		
	} 

}
