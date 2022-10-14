package j221011.chap06_Class_218_Calculator;

public class P218_CalcuatorExample {

	public static void main(String[] args) {
//		//p218 메소드 호출
//		// TODO Auto-generated method stub
//		Calculator myCalc = new Calculator();
//		myCalc.powerOn();
//		
//		int result1 = myCalc.plus(5, 6);
//		System.out.println("result1" + result1);
//		
//		byte x = 10;
//		byte y = 4;
//		
//		double result2 = myCalc.divide(x, y);
//		System.out.println("result2" + result2);
//		myCalc.powerOFF();
//		
		//p232 메소드 오버로딩
		Calculator myCalcu = new Calculator();
		
		//정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);
		
		//직사각형의 넓이 구하기
		double result2 = myCalcu.areaRectangle(10,20);
		
		//결과 출력
		System.out.println("정사각형 넓이=" + result1);
		System.out.println("직사각형 넓이=" + result2);
	}
}
