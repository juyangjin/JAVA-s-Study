package j221110.chap07_Inheritance_P315Car;

public class P320_CarExample {//앞선 P317보다 간결하게 바뀐 CarExample class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P319_Car car = new P319_Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			if(problemLocation != 0) {
				System.out.println(car.tires[problemLocation-1].location + "HankookTire로 교체");
				car.tires[problemLocation-1] =
						new HankookTire(car.tires[problemLocation-1].location, 15);
			}
			System.out.println("----------------------------");
		}
	}
}
