package j221107.chap07_Inheritance;

public class P302_SportsCar extends Car { //재정의할 수 없는 final 메소드
	@Override
	public void speedUp() { speed += 10;}
	
	//오버라이딩을 할 수 없음
	//@Override
	//public void stop() {
	//	System.out.println("스포츠카를 멈춤");
	//	speed = 0;
	//}

}
