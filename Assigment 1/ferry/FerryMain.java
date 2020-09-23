/**
 * 
 */
package ferry;

/**
 * @author Adam
 *
 */
public class FerryMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FerryClass ferry = new FerryClass();

		System.out.println(ferry.toString());

		Bicycle bicycle = new Bicycle();
		ferry.embark(bicycle);
		
		Lorry lorry = new Lorry(2);
		ferry.embark(lorry);
		
		
		Car car = new Car(4);
		ferry.embark(car);

		Bus bus = new Bus(15);
		ferry.embark(bus);
		

		System.out.println(ferry.toString());
		
		ferry.disembark();

		System.out.println("\nFerry after disembark");
		System.out.println(ferry.toString());

	}

}
