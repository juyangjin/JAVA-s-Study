package j221011.chap06_Class_218_Calculator;

public class Calculator {
	
//	//p218 
//	//메소드 선언
//	void powerOn() {
//		System.out.println("전원을 켭니다.");
//	}
//	
//	int plus(int x, int y) {
//		int result = x + y;
//		return result;
//	}
//	
//	double divide(int x, int y) {
//		double result = (double)x/(double)y;
//		return result;
//	}
//	
//	void powerOFF() {
//		System.out.println("전원을 끕니다.");
//	}
	
	//p232 메소드 오버로딩
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
