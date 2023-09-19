package chap7_2.exam04;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver drive = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		drive.drive(bus);
		drive.drive(taxi);
	}

}
