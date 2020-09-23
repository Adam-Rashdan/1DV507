package ferry;

public class Passenger {

	private int cost ;
	
	public Passenger (int cost ) {
		
		
		this.cost = cost ;
	}

	public int getCost() {
		return cost;
	}

	@Override
	public String toString() {
		return "Passenger [cost=" + cost + "]";
	}


	
	
}
