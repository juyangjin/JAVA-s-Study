package j221111.chap07_Inheritance;

public class P323_DriverExample {//실행 클래스

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Driver driver = new Driver();
		 
		 Bus bus = new Bus();
		 Taxi taxi = new Taxi();
		 
		 driver.drive(bus);
		 driver.drive(taxi);
	}

}
