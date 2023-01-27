package chapter10;

public class DriverMain {

	public static void main(String[] args) {
		Driver driver = new Driver();
//		Bus bus = new Bus();
//		Taxi taxi = new Taxi();
//		
//		driver.drive(bus);
//		driver.drive(taxi);

		driver.drive(new Bus());
		driver.drive(new Taxi());
	}
}
