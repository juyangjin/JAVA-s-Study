package j221107.chap07_Inheritance;

public class P317_CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P315_Car car = new Car(); //Car 객체 생성
		
		for(int i=1;i<=5;i++) { //Car 객체의 run() 메소드 5번 반복실행
			int problemLocation = car.run();
		}
		
		switch(problemLocation) {
		case 1:
			System.out.println("앞왼쪽 HankookTire로 교체");
		}

	}

}
