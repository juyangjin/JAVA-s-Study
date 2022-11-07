package j221107.chap07_Inheritance;

public class Computer extends Calculator { //자식클래스
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

}
