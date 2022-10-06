package JIN221006.Chap06_Class_201_Car;

//P201부터 214까지 이어진 Car 수정파일
public class Car {
	
//	//P201 Car 클래스 필드 선언
//	String company = "현대자동차";
//	String model = "그랜저";
//	String color = "검정";
//	int maxSpeed = 350;
//	int speed;
	
	//---------------------------------------------
	//P205 
	//생성자 선언
//	Car(String color, int cc){ //클래스에서 생성자가 명시적으로 선언되어 있으면, 반드시 선언된 생성자를 호출해서 객체를 생성해야함.
//		
//	}
	
	//---------------------------------------------
	//p210
	//생성자의 오버로딩, 오버로딩이란 생성자를 여러개 함께 사용하는 것을 말하며,
	//생성자 이름과 무관하게 매개변수타입과 갯수, 순서가 다르게 선언된 것을 말한다.
	//매개변수타입, 갯수, 순서가 동일하면 이름이 다르다 해도 오버로딩이라 볼 수 없다.
	//생성자가 오버로딩되면 new 연산자로 생성자를 호출할 때 제공되는 매개값의 타입과 수에 의해 호출될 생성자가 결정된다.

//		String company = "현대자동차"; //필드
//		String model ="우선순위실험"; //필드 정의를 여기서 먼저 했어도, 메인클래스에서 변경된 값으로 출력됨.
//		String color;
//		int maxSpeed;
//		
//		//생성자1 - 매개값 타입이 따로 지정되지 않는 기본생성자
//		Car(){
//			
//		}
//		
//		//생성자2 - String model을 명시적으로 선언
//		Car(String model){
//			this.model = model;//this는 해당 생성자를 말하며, 명시적으로 선언된 생성자를 model필드에 저장
//		}
//		
//		//생성자3 - String model과 String color를 명시적으로 선언
//		Car(String model, String color) {
//			this.model = model; //명시적으로 선언된 model과 color를 해당 필드들에 저장
//			this.color = color;
//		}
//		
//		//생성자4 String model, String color, int maxSpeed를 명시적으로 선언
//		Car(String model, String color, int maxSpeed){ 
//			this.model = model; //명시적으로 선언된 model,color,maxSpeed를 해당 필드에 저장
//			this.color = color;	
//			this.maxSpeed = maxSpeed;
//		}
		
	//---------------------------------------------
	//p213
	String company = "현대자동차"; //필드
	String model;
	String color;
	int maxSpeed;
	
	Car() { //생성자1
		
	}
	
	Car(String model) { //생성자2
		this(model, "은색", 250); 
	}
	
	Car(String model, String color) { //생성자3
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed) { 
		this.model = model; //실행된 생성자들을 다 불러오는 공통실행코드
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
