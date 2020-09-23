package ferry;

import java.util.Iterator;

public class FerryClass implements Ferry {



	private Passenger[] passengers;
	private int passengersAmount;
	private Vehicle[] vehicles;
	private int vehiclesAmount;
	private int space = 200;
	private int money = 0;
	private int usedSpace = 0;
	
	public FerryClass() {
		vehicles = new Vehicle[10];
		vehiclesAmount = 0;
		passengers = new Passenger[200];
		passengersAmount = 0;
	}
	
	@Override
	public int countPassengers() {
		
		return passengersAmount;
	}

	@Override
	public int countVehicleSpace() {
		
		return (200-space);

	}

	@Override
	public int countMoney() {
		
		return money;
	}

	@Override
	public Iterator<Vehicle> iterator() {
		
		return new VehicleIterator();
	}

	@Override
	public void embark(Vehicle v) {
		if(test(v)){
			if(hasSpaceFor(v)){
				vehicles[vehiclesAmount] = v;
				vehiclesAmount++;
				space = space - v.getSize();
				usedSpace = usedSpace +  v.getSize();
				money = money + v.getTotalVehicleCost();
				Passenger[] temp = v.getPassengers();
				for (int i = 0; i < temp.length; i++){
					if(hasRoomFor(temp[i])){
						embark(temp[i]);
					}else{
						System.out.println("No more spaces for passengers!");
					}
					
				}
			}else {
				System.out.println("The Ferry is full ! no more space for vehicles!");
			}
		}else {
			System.out.println("The vehicle is already on the ferry!");
		}
		
	}

	@Override
	public void embark(Passenger p) {
		if(hasRoomFor(p)){
			passengers[passengersAmount] = p;
			passengersAmount++;
			money = money + p.getCost();
		}else {
			System.out.println(" The Ferry is full !! no more passengers!");
		}
		
	}

	@Override
	public void disembark() {
		
		vehicles = new Vehicle[10];
		vehiclesAmount = 0;
		passengers = new Passenger[200];
		passengersAmount = 0;
		space = 200;
		usedSpace = 0;
		
	}

	@Override
	public boolean hasSpaceFor(Vehicle v) {
	
		if (v.getSize() <= space){
			return true;
		}
		return false;
	}

	@Override
	public boolean hasRoomFor(Passenger p) {
		
		if (passengersAmount >= 200){
			return false;
		}
		return true;
	}
	
	private boolean test(Vehicle v) {
	
		Iterator<Vehicle> ito = iterator();
		while (ito.hasNext()) {
			if(v == ito.next()){
				return false;
			}
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "FerryClass [ passengers = " + passengersAmount
				+ ", vehicles = " + vehiclesAmount + ", Remaining Space = " + space
				+ ", money = " + money + ", usedSpace = " + usedSpace + " ]";
	}
	
	class VehicleIterator implements Iterator<Vehicle> {
		private int count = 0;
		public Vehicle next() {
			
			return vehicles[count++];
			
		}
		
		
		public boolean hasNext() {
			
			return count<vehiclesAmount;
			
		}

	}
	
	

}
