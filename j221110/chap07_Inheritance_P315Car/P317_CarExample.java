package j221110.chap07_Inheritance_P315Car;

public class P317_CarExample {

	public static void main(String[] args) {
		
		Car car = new Car(); //Car 객체 생성
		
		for(int i=1;i<=5;i++) { //Car 객체의 run() 메소드 5번 반복실행
			int problemLocation = car.run();
		
		switch(problemLocation) {
		case 1:
			System.out.println("앞왼쪽 HankookTire로 교체");//앞 왼쪽 타이어 펑크시
			car.frontLeftTire = new HankookTire("앞왼쪽",15);//한국타이어로 교체
		break;
		case 2:
			System.out.println("앞오른쪽 KumhoTire로 교체"); //앞오른쪽 타이어 펑크시
			car.frontRightTire = new KumhoTire("앞오른쪽",13);//금호타이어로 교체
		break;
		case 3:
			System.out.println("뒤왼쪽 HankookTire로 교체"); //뒤 왼쪽 타이어 펑크시
			car.backLeftTire = new HankookTire("뒤왼쪽",14); //한국타이어로 교체
		break;
		case 4:
			System.out.println("뒤오른쪽 KumhoTire로 교체"); //뒤오른쪽 타이어 펑크 시
			car.backLeftTire = new HankookTire("앞왼쪽",17); //금호타이어로 교체
			break;
		}
		System.out.println("------------------"); //1회전 시 출력되는 내용을 구분
		}
	}
}
