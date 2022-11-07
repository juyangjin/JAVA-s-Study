package j221107.chap07_Inheritance;

public class Car { //p302
	//필드
	public int speed;
	
	//메소드
	public void speedUp() { speed += 1;}
	
	//final 메소드, 재정의 할 수 없다.
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}

}
