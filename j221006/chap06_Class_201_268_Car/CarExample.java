package j221006.chap06_Class_201_268_Car;

//P201부터 쭉 이어진 CarExample 수정파일, 뒤로 갈 수록 효율이 높아지는 느낌.
public class CarExample {
	public static void main(String[] args) {
		
		//P201
		//Car 클래스를 사용하여 myCar객체 생성
//		Car myCar = new Car();
//		
//		//Car 클래스에서 선언된 필드를 이용하여 출력문 작성 
//		System.out.println("제작회사: " + myCar.company); //객체.필드 형태로 출력
//		System.out.println("모델명: " + myCar.model);
//		System.out.println("색깔: " + myCar.color);
//		System.out.println("최고속도: " + myCar.maxSpeed);
//		System.out.println("현재속도: " + myCar.speed);
//		
//		//Car에서 선언된 필드값을 별도로 변경하여 선언도 가능.
//		myCar.speed = 60;
//		System.out.println("수정된 속도: " + myCar.speed);
		
		//---------------------------------------------
		//P205
//		Car myCar = new Car("검정", 3000); //Car 클래스에서 (String color, int cc)로 명시적 선언을 했기 때문에, 
//										  //객체 생성시 color에 해당하는 문자열과, cc에 해당하는 정수형 객체를 생성해야야 함. 
//										  //()가 비어있는 기본생성자는 생성할 수 없음.
//		System.out.println(myCar); //myCar 객체의 경로가 출력됨. 원래 경로가 Car였으므로 그 뒤에 상세경로 출력.
		
		//---------------------------------------------
		//P210
		//생성자 오버로딩을 통해 여러가지 타입으로 출력, 여기서는 의도적으로 생성자 이름을 구분하기 위해 변수이름에 번호를 작성함
//		Car car1 = new Car(); //Car이라는 생성자를 선택하여 인스턴스화(객체화), 매개값 없는 기본생성자이므로 1이 사용됨.
//		System.out.println("car1.company : " + car1.company + "\n"); //출력문은 Car에 저장된 pompany 필드값이 출력됨.
//	  //System.out.println(); // 중간을 띄어쓸 때 항상 출력문을 쓰는 건 비효율적이므로 \n으로 대체
//		
//		Car car2 = new Car("자가용"); 
//		//new 뒤에 Car에 커서를 올려서 파란 화살표를 눌러보면 어느 생성자에서 객체가 생성된 것인지 알 수 있음.
//		//문자열 1개이기 때문에 2번 생성자가 사용됨.
//		System.out.println("car2.company : " + car2.company);
//		System.out.println("car2.model : " + car2.model+ "\n"); 
//		//Car클래스에서 "우선순위실험"이라는 문자열을 저장했으나, 객체가 생성될 때 선언된 "자가용"이 출력됨.	
//		
//		//System.out.println(); // 중간을 띄어쓸 때 항상 출력문을 쓰는 건 비효율적이므로 \n으로 대체
//		
//		Car car3 = new Car("자가용", "빨강"); //문자열 2개라서 3번 생성자가 사용됨.
//		System.out.println("car3.company : " + car3.company);
//		System.out.println("car3.model : " + car3.model);
//		System.out.println("car3.color : " + car3.color+ "\n");
//	//	System.out.println(); // 중간을 띄어쓸 때 항상 출력문을 쓰는 건 비효율적이므로 \n으로 대체
//		
//		Car car4 = new Car("택시","검정",200); //문자열 2개와 정수형 1개라서 4번 생성자가 사용됨
//		System.out.println("car4.company : " + car4.company);
//		System.out.println("car4.model : " + car4.model);
//		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		
		//---------------------------------------------
		//P213
//		Car car1 = new Car();
//		System.out.println("car1.company : " + car1.company+ "\n");
//		
//		Car car2 = new Car("자가용");
//		System.out.println("car2.company : " + car2.company);
//		System.out.println("car2.model : " + car2.model+ "\n");
//		
//		Car car3 = new Car("자가용","빨강");
//		System.out.println("car3.company : " + car3.company);
//		System.out.println("car3.model : " + car3.model);
//		System.out.println("car3.color : " + car3.color+ "\n");
//		
//		Car car4 = new Car("택시","검정", 200) ;
//		System.out.println("car4.company : " + car4.company);
//		System.out.println("car4.model : " + car4.model);
//		System.out.println("car4.color : " + car4.color);
//		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		
		//---------------------------------------------
//		//p223
//		Car myCar = new Car();
//		
//		myCar.setGas(5); //Car의 setGas() 메소드 호출
//		
//		boolean gasState = myCar.isLeftGas();
//		if(gasState) {
//			System.out.println("출발합니다.");
//			myCar.run(); //Car의 run() 메소드 호출
//		}
//		
//		if(myCar.isLeftGas()) {
//			System.out.println("gas를 주입할 필요가 없습니다.");
//		} else {
//			System.out.println("gas를 주입하세요.");
//		}
		
//		//p229
//		//클래스 외부에서 메소드 호출
//		Car myCar = new Car();
//		myCar.keyTurnOn();
//		myCar.run();
//		int speed = myCar.getSpeed();
//		System.out.println("현재 속도:" + speed + "km/h");
//		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
//		//p235 인스턴스 넘버와 this
//		Car myCar = new Car("포르쉐");
//		Car yourCar = new Car("벤츠");
//		
//		myCar.run();
//		yourCar.run();
		
		//p268 Getter와 Setter 메소드 사용 
		//저자는 잘못된 속도변경을 먼저 작성하였으나, 나는 조금 변경하여 올바른 속도변경을 먼저 설정해서 출력을 다르게 해보았다.
		Car myCar = new Car();
		
		//올바른 속도변경
		myCar.setSpeed(60); //Car의 setter 메소드로 해당 값이 이동하여 매개값 검사, setter와 getter의 리턴값이 된다.
		
		System.out.println("현재 속도: " + myCar.getSpeed());
		//잘못된 속도 변경이 아닌, 올바른 속도 변경부터 작성하게 되면 출력값이 올바르게 나오게 된다.
		
		myCar.setSpeed(-50); //잘못된 속도변경으로 인해 setter와 getter의 리턴값이 0이 된다.
		
		//멈춤
		if(!myCar.isStop()) {//위에 입력된 값으로 인해 myCar.isStop의 리턴값이 0이 되어 자동차를 멈추기 위해 실행됨)
			myCar.setStop(true); //자동차가 멈춤
		}
		System.out.println("현재 속도: " + myCar.getSpeed()); //자동차가 멈췄으니 속도는 0이 된다. 
	}
}
