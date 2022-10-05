package JIN221004.Chap06_Class_210;

public class Car {
	//생성자의 오버로딩
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자1
	Car(){
		
	}
	
	//생성자2
	Car(String model){
		this.model = model;
	}
	
	//생성자3
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	//생성자4
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;	
		this.maxSpeed = maxSpeed;
	}
}
